import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import javax.swing.*;
import java.awt.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class DisplayTimer extends JDialog {
    


    private int iMinute = 0;
    
    private int iSecond = 0;

    private int iSizeCaption = 13;
    
    private int iSizeCounter = 3;

    private int iSizeDescription = 30;
 
    private int iSizeCurrentTime = 30;

    private int iColonDistance = 50;
    
    private Properties prpConfiguration = null;

    private JLabel lblCaption = new JLabel();

    private JLabel lblCounterMinutes = new JLabel();
   
    private JLabel lblCounterColon = new JLabel();

    /** Counter: seconds. */
    private JLabel lblCounterSeconds = new JLabel();

    /** Counter-description: minutes. */
    private JLabel lblDescriptionMinutes = new JLabel();

    /** Counter-description: colon. */
    private JLabel lblDescriptionColon = new JLabel();

    /** Counter-description: seconds. */
    private JLabel lblDescriptionSeconds = new JLabel();

    /** Current time. */
    private JLabel lblCurrentTime = new JLabel();

    /** Flag, if overtime should be shown. */
    private boolean bOvertime = false;

    /** Flag, if timer decreases at the moment. */
    private boolean bDecreasing = true;

    /** Flag, if timer pauses. */
    private boolean bPaused = false;

    /** Flag, if timer is currently showing Deciseconds. */
    private boolean bIsShowingDecis = false;

    /** Flag, if timer should show Deciseconds. */
    private boolean bShowDeciSeconds = false;

    /** Flag, if timer should close when reaching zero. */
    private boolean bDisposeOnZero = false;

   

    /** Clip for WAV-Playing. */
    public static Clip newClip = null;

    /** Central timer. */
    private Timer theTimer = null;

    /** Flag, if color should be changed randomly. */
    private boolean bRandomColor = false;

    /** Change interval for color. */
    private int iColorChangeInterval = 0;

    /** Counter for random color change. */
    private int iRandomColorCounter = 0;

    /** Random number generator. */
    private Random theRandom = new Random();

    /** Time of last update-call. */
    private int lastTime = 0;

    /** Flag, if zero has been reached. */
    private boolean bZeroReached = false;

    /** Flag, if wav should be played. */
    private boolean bPlayWav = true;

    /** Count time. */
    private int count = 0;

    /** Count seconds or deciseconds. */
    private int iCountLimit = 1000;

    public DisplayTimer(Properties prpInit) {
        try {
            prpConfiguration = prpInit;
            initTimer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initTimer() {

        Font fntTemp = null;
        Color clrTemp = null;
        int iYPos = 0;

        // size, location, layout, color, other things
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int) screenSize.getWidth(), (int) screenSize.getHeight());
        setLocationRelativeTo(null);
        setModal(true);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(Integer.parseInt(prpConfiguration.getProperty("clrBack"))));
        setBackground(new Color(Integer.parseInt(prpConfiguration.getProperty("clrBack"))));

        // Listeners
        addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    closeDialog();
                }
            });
        addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) {
                    closeDialog();
                }
            });
        addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e) {
                    checkKey(e);
                }
            });

        // set flags and values
        bShowDeciSeconds = Boolean.parseBoolean(prpConfiguration.getProperty("chkDisplayDeci"));
        bOvertime = Boolean.parseBoolean(prpConfiguration.getProperty("chkDisplayOvertime"));
        bRandomColor = Boolean.parseBoolean(prpConfiguration.getProperty("chkRandom"));
        iColorChangeInterval = Integer.parseInt(prpConfiguration.getProperty("intInterval"));
        bDisposeOnZero = Boolean.parseBoolean(prpConfiguration.getProperty("chkDispose"));

        // text above counter
        fntTemp = new Font(prpConfiguration.getProperty("cboTextFont"),
            Integer.parseInt(prpConfiguration.getProperty("cboTextFontStyle")), 
            getHeight() / iSizeCaption);
        clrTemp = new Color(Integer.parseInt(prpConfiguration.getProperty("clrText")));

        lblCaption.setHorizontalAlignment(SwingConstants.CENTER);
        lblCaption.setHorizontalTextPosition(SwingConstants.CENTER);
        lblCaption.setSize(getWidth(), fntTemp.getSize());
        lblCaption.setLocation(0, (getHeight() / 5) - (lblCaption.getHeight() / 2));
        lblCaption.setFont(fntTemp);
        lblCaption.setForeground(clrTemp);

        // counter
        fntTemp = new Font(prpConfiguration.getProperty("cboNumberFont"),
            Integer.parseInt(prpConfiguration.getProperty("cboNumberFontStyle")),
            getHeight() / iSizeCounter);
        clrTemp = new Color(Integer.parseInt(prpConfiguration.getProperty("clrNumber")));
        iYPos = (getHeight() - fntTemp.getSize()) / 2;

        lblCounterMinutes.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCounterMinutes.setHorizontalTextPosition(SwingConstants.RIGHT);
        lblCounterMinutes.setSize(getWidth() / 2 - iColonDistance, fntTemp.getSize());
        lblCounterMinutes.setLocation(0, iYPos);
        lblCounterMinutes.setFont(fntTemp);
        lblCounterMinutes.setForeground(clrTemp);

        lblCounterColon.setHorizontalAlignment(SwingConstants.CENTER);
        lblCounterColon.setHorizontalTextPosition(SwingConstants.CENTER);
        lblCounterColon.setSize(this.getWidth(), fntTemp.getSize());
        lblCounterColon.setLocation(0, iYPos);
        lblCounterColon.setFont(fntTemp);
        lblCounterColon.setForeground(clrTemp);
        lblCounterColon.setText(":");

        lblCounterSeconds.setHorizontalAlignment(SwingConstants.LEFT);
        lblCounterSeconds.setHorizontalTextPosition(SwingConstants.LEFT);
        lblCounterSeconds.setSize(this.getWidth() / 2, fntTemp.getSize());
        lblCounterSeconds.setLocation(this.getWidth() / 2 + iColonDistance, iYPos);
        lblCounterSeconds.setFont(fntTemp);
        lblCounterSeconds.setForeground(clrTemp);

        // description
        fntTemp = new Font(prpConfiguration.getProperty("cboTextFont"), Font.PLAIN, getHeight() / iSizeDescription);
        clrTemp = new Color(Integer.parseInt(prpConfiguration.getProperty("clrNumber")));
        iYPos += lblCounterColon.getHeight();

        lblDescriptionMinutes.setHorizontalAlignment(SwingConstants.RIGHT);
        lblDescriptionMinutes.setHorizontalTextPosition(SwingConstants.RIGHT);
        lblDescriptionMinutes.setSize(getWidth() / 2 - iColonDistance, fntTemp.getSize());
        lblDescriptionMinutes.setLocation(0, iYPos);
        lblDescriptionMinutes.setFont(fntTemp);
        lblDescriptionMinutes.setForeground(clrTemp);
        lblDescriptionMinutes.setVisible(Boolean.parseBoolean(prpConfiguration.getProperty("chkDisplayDescription")));

        lblDescriptionColon.setHorizontalAlignment(SwingConstants.CENTER);
        lblDescriptionColon.setHorizontalTextPosition(SwingConstants.CENTER);
        lblDescriptionColon.setSize(getWidth(), fntTemp.getSize());
        lblDescriptionColon.setLocation(0, iYPos);
        lblDescriptionColon.setFont(fntTemp);
        lblDescriptionColon.setForeground(clrTemp);
        lblDescriptionColon.setVisible(Boolean.parseBoolean(prpConfiguration.getProperty("chkDisplayDescription")));
        lblDescriptionColon.setText(":");

        lblDescriptionSeconds.setHorizontalAlignment(SwingConstants.LEFT);
        lblDescriptionSeconds.setHorizontalTextPosition(SwingConstants.LEFT);
        lblDescriptionSeconds.setSize(getWidth() / 2, fntTemp.getSize());
        lblDescriptionSeconds.setLocation(getWidth() / 2 + iColonDistance, iYPos);
        lblDescriptionSeconds.setFont(fntTemp);
        lblDescriptionSeconds.setForeground(clrTemp);
        lblDescriptionSeconds.setVisible(Boolean.parseBoolean(prpConfiguration.getProperty("chkDisplayDescription")));

        // current time
        Date theDate = new Date();
        lastTime = (int) theDate.getTime();
        lblCurrentTime.setText(DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM).format(theDate));
        lblCurrentTime.setSize(getWidth(), getHeight() / iSizeCurrentTime);
        lblCurrentTime.setLocation(0, getHeight() - lblCurrentTime.getHeight());
        lblCurrentTime.setVisible(Boolean.parseBoolean(prpConfiguration.getProperty("chkDisplayCurrent")));
        lblCurrentTime.setFont(new Font(prpConfiguration.getProperty("cboTextFont"), Font.PLAIN, getHeight() / iSizeCurrentTime));
        lblCurrentTime.setForeground(new Color(Integer.parseInt(prpConfiguration.getProperty("clrText"))));

        // set values
        try {
            iMinute = Integer.parseInt(prpConfiguration.getProperty("txtMinutes"));
        } catch (NumberFormatException e) {
            iMinute = 0;
        }
        try {
            iSecond = Integer.parseInt(prpConfiguration.getProperty("txtSeconds"));
        } catch (NumberFormatException e) {
            iSecond = 0;
        }
        setTime(true);
       
             

      

        // layout of components
        getContentPane().add(lblCaption, null);
        getContentPane().add(lblCounterMinutes, null);
        getContentPane().add(lblCounterSeconds, null);
        getContentPane().add(lblCounterColon, null);
        getContentPane().add(lblDescriptionMinutes, null);
        getContentPane().add(lblDescriptionColon, null);
        getContentPane().add(lblDescriptionSeconds, null);
        getContentPane().add(lblCurrentTime, null);

        // background image

        // timer (ticks every 50 milliseconds)
        theTimer = new Timer(50, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    updateTimer();
                }
            });
        theTimer.setRepeats(true);
        theTimer.start();

    }

    
    private void setTime(boolean bUpdateTexts) {
        if (bUpdateTexts) {
            // if Deciseconds should be shown and the time is less than 60 seconds, show them
            if (bShowDeciSeconds && !bIsShowingDecis) {
                if (iMinute == 0) {
                    iMinute = iSecond;
                    iSecond = 0;
                    bIsShowingDecis = true;
                } else if ((iMinute == 1) && (iSecond == 0)) {
                    iMinute = 60;
                    bIsShowingDecis = true;
                }
            }
            if (bIsShowingDecis) {
                lblDescriptionMinutes.setText("Seconds");
                lblDescriptionSeconds.setText("Tenths");
            } else {
                lblDescriptionMinutes.setText("Minutes");
                lblDescriptionSeconds.setText("Seconds");
            }

        }
        lblCounterMinutes.setText(Integer.toString(iMinute));
        lblCounterSeconds.setText(((iSecond < 10) && !bIsShowingDecis) ? "0" + Integer.toString(iSecond) : Integer.toString(iSecond));
    }

    private void closeDialog() {
        theTimer.stop();
        if (newClip != null) {
            newClip.stop();
        }
        setVisible(false);
    }

    /**
     * Increments counter by one second.
     */
    private void incrementBySecond() {

        iSecond++;
        if (iSecond == 60) {
            iSecond = 0;
            iMinute++;
        }

    }

    /**
     * Decrements counter by one second.
     */
    private void decrementBySecond() {

        iSecond--;
        if (iSecond == -1) {
            iSecond = (bIsShowingDecis) ? 9 : 59;
            iMinute--;
        }

    }

    
    private void updateTimer() {

        // do nothing if timer is paused
        if (bPaused) {
            return;
        }

        // update time
        Date theDate = new Date();
        long lTime = theDate.getTime();
        lblCurrentTime.setText(DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM).format(theDate));

        // change color, if random colors are selected

        // remember times
        count += lTime - lastTime;
        lastTime = (int) lTime;

        // decrease timer if necessary
        iCountLimit = (bIsShowingDecis) ? 100 : 1000;
        if (bDecreasing) {

            if (count >= iCountLimit) {
                count -= iCountLimit;
                decrementBySecond();
                setTime(((iMinute == 1) && (iSecond == 0)));
            }

        } else if (bOvertime && (count >= iCountLimit)) {
            count -= iCountLimit;
            incrementBySecond();
            setTime(false);
        }

        // time's up?
        if (iMinute == 0 && iSecond == 0) {

            bDecreasing = false;
            bIsShowingDecis = false;
            bShowDeciSeconds = false;
            bZeroReached = true;

            setTime(true);


            if (bDisposeOnZero) {
                closeDialog();
            }

        }

    }

    private void checkKey(KeyEvent e) {
        if (e.getKeyChar() == 'p' || e.getKeyChar() == 'P' || e.getKeyChar() == ' ') {
            bPaused = !bPaused;
            if (bPaused) {
                lblCurrentTime.setText("Paused");
                lblCurrentTime.setVisible(true);
            } else {
                lblCurrentTime.setVisible(Boolean.parseBoolean(prpConfiguration.getProperty("chkDisplayCurrent")));
            }
        }
        if (e.getKeyChar() == 'q') {
            closeDialog();
        }
    }

}

