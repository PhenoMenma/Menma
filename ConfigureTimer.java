import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.JTextComponent;

public class ConfigureTimer extends JFrame {
    
    /** Configuration. */
    private Properties prpConfiguration = new Properties();
    private JPanel contentPane;
    JPanel pnlTexts = new JPanel();
    private JTextField txtRunningText = new JTextField();
    private JLabel lblCurrentTime = new JLabel();
    Timer timer = new Timer(1000,
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    lblCurrentTime.setText(DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM).format(new Date()));
                }
            });

   

    private JTextField txtBackgroundPath = new JTextField();

    private JButton btnBackgroundImage = new JButton();

    private JCheckBox chkMaximizeBackground = new JCheckBox();

    private JPanel pnlTime = new JPanel();

    private JPanel pnlButtons = new JPanel();

    private JPanel pnlOptions = new JPanel();

    private JCheckBox chkDisplayCurrentTime = new JCheckBox();

    private JCheckBox chkDisplayOvertime = new JCheckBox();

    private JCheckBox chkDisplayDescription = new JCheckBox();

    private JPanel pnlFonts = new JPanel();

    private JPanel pnlPreview = new JPanel();

    private JLabel lblPreviewNumber = new JLabel();

    private JLabel lblPreviewText = new JLabel();

    private JButton btnChangeNumberColor = new JButton();

    private JButton btnChangeTextColor = new JButton();

    private JButton btnChangeBackgroundColor = new JButton();

    private JPanel pnlBackground = new JPanel();

    private JTextField txtSplashPath = new JTextField();

    private JButton btnRun = new JButton();

    private JButton btnExit = new JButton();

    

    ComboBoxModel phyFonts1 = new DefaultComboBoxModel(GraphicsEnvironment
            .getLocalGraphicsEnvironment().getAvailableFontFamilyNames());

    ComboBoxModel phyFonts2 = new DefaultComboBoxModel(GraphicsEnvironment
            .getLocalGraphicsEnvironment().getAvailableFontFamilyNames());

    private JComboBox cboNumberFontList = new JComboBox(phyFonts1);

    private JComboBox cboTextFontList = new JComboBox(phyFonts2);

    private JComboBox cboNumberFontStyleList = new JComboBox();

    private JComboBox cboTextFontStyleList = new JComboBox();

    private JTextField txtMinutes = new JTextField();

    private JTextField txtSeconds = new JTextField();

    private JCheckBox chkDisplayDeciSeconds = new JCheckBox();

    private JCheckBox chkDisposeOnStop = new JCheckBox();

    private JCheckBox chkLoopWAV = new JCheckBox();

    private JCheckBox chkMaximizeSplash = new JCheckBox();

    private JCheckBox chkRandomBackground = new JCheckBox();

    private JSpinner spnBackgroundInterval = new JSpinner(new SpinnerNumberModel(1, 1, 60, 1));

    private JTabbedPane tabConfig = new JTabbedPane(JTabbedPane.TOP);

    private JPanel pnlTabTime = new JPanel();
 
    public ConfigureTimer(String strFile) {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        try {
            jbInit();
            if (strFile != null) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    private void jbInit() throws Exception {

        // Current time
        lblCurrentTime.setText(DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM).format(new Date()));

        // Time
        txtMinutes.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e) {
                    checkKeys(e, 2, true);
                }
            });
        txtSeconds.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e) {
                    checkKeys(e, 2, true);
                }
            });
        pnlTime.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Time"));
        pnlTime.setLayout(new GridBagLayout());
        pnlTime.setToolTipText("Enter the countdown time.");
        GridBagHandler.addComponent(pnlTime, new JLabel("Minutes"), 0, 0);
        GridBagHandler.addComponent(pnlTime, txtMinutes, 1, 0);
        GridBagHandler.addComponent(pnlTime, new JLabel("Seconds"), 2, 0);
        GridBagHandler.addComponent(pnlTime, txtSeconds, 3, 0);

        btnRun.setText("Run");
        btnRun.setMnemonic(KeyEvent.VK_R);
        btnRun.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    showTimer();
                }
            });
        btnExit.setText("Exit");
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnExit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    closeApplication();
                }
            });
        pnlButtons.setLayout(new GridBagLayout());
        pnlButtons.setToolTipText("Start timer or exit application.");
        GridBagHandler.addComponent(pnlButtons, btnRun, 0, 0);
        GridBagHandler.addComponent(pnlButtons, btnExit, 1, 0);

        // options

        chkDisplayDeciSeconds.setText("Display tenths of second");
        chkDisplayDescription.setText("Display counter description");
        pnlOptions.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Options"));
        pnlOptions.setLayout(new GridBagLayout());
        pnlOptions.setToolTipText("Select options.");

        GridBagHandler.addComponent(pnlOptions, chkDisplayDeciSeconds, 0, 1);
        GridBagHandler.addComponent(pnlOptions, chkDisplayDescription, 1, 1);

        // tabbed panel
        pnlTabTime.setLayout(new GridBagLayout());
        GridBagHandler.addComponent(pnlTabTime, pnlTime, 0, 0);
        GridBagHandler.addComponent(pnlTabTime, pnlTexts, 0, 1);
        GridBagHandler.addComponent(pnlTabTime, pnlOptions, 0, 2);


      

        tabConfig.addTab("time and texts", pnlTabTime);

       
        contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(lblCurrentTime, BorderLayout.NORTH);
        contentPane.add(tabConfig, BorderLayout.CENTER);
        contentPane.add(pnlButtons, BorderLayout.SOUTH);

        timer.setRepeats(true);
        timer.start();

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    closeApplication();
                }
            });

    }

    public void closeApplication() {
        System.exit(0);
    }

    private void getConfiguration() {
        prpConfiguration = new Properties();
 
        prpConfiguration.put("chkMaximizeBackground", (chkMaximizeBackground.isSelected() ? Boolean.TRUE.toString() : Boolean.FALSE.toString()));
        prpConfiguration.put("txtMinutes", txtMinutes.getText());
        prpConfiguration.put("txtSeconds", txtSeconds.getText());
        prpConfiguration.put("chkDisplayCurrent", (chkDisplayCurrentTime.isSelected() ? Boolean.TRUE.toString() : Boolean.FALSE.toString()));
        prpConfiguration.put("chkDisplayOvertime", (chkDisplayOvertime.isSelected() ? Boolean.TRUE.toString() : Boolean.FALSE.toString()));
        prpConfiguration.put("chkDisplayDeci", (chkDisplayDeciSeconds.isSelected() ? Boolean.TRUE.toString() : Boolean.FALSE.toString()));
        prpConfiguration.put("chkDisplayDescription", (chkDisplayDescription.isSelected() ? Boolean.TRUE.toString() : Boolean.FALSE.toString()));
        prpConfiguration.put("cboNumberFont", cboNumberFontList.getSelectedItem());
        prpConfiguration.put("cboNumberFontStyle", Integer.toString(cboNumberFontStyleList.getSelectedIndex()));
        prpConfiguration.put("cboTextFont", cboTextFontList.getSelectedItem());
        prpConfiguration.put("cboTextFontStyle", Integer.toString(cboTextFontStyleList.getSelectedIndex()));
        prpConfiguration.put("clrNumber", Integer.toString(lblPreviewNumber.getForeground().getRGB()));
        prpConfiguration.put("clrText", Integer.toString(lblPreviewText.getForeground().getRGB()));
        prpConfiguration.put("clrBack", Integer.toString(lblPreviewNumber.getBackground().getRGB()));
        prpConfiguration.put("txtSplash", txtSplashPath.getText());
        prpConfiguration.put("intInterval", spnBackgroundInterval.getValue().toString());
    }

    private void checkKeys(KeyEvent e, int iMax, boolean bIsNumber) {
        String strText = ((JTextComponent) e.getSource()).getText();
        if ((int) e.getKeyChar() != 8) {
            if (strText.length() >= iMax) {
                e.consume();
            } else if (bIsNumber) {
                if (!Character.isDigit(e.getKeyChar()) || ((strText.length() >= 1) && (strText.charAt(0) >= '6'))) {
                    e.consume();
                }
            }
        }
    }

    private void showTimer() {
        getConfiguration();
        DisplayTimer theTimer = new DisplayTimer(prpConfiguration);
        theTimer.setVisible(true);
        if (Boolean.parseBoolean(prpConfiguration.getProperty("chkDispose"))) {
            closeApplication();
        }

    }

}

