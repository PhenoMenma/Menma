import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.JScrollPane;
public class timer
{ 

    public timer()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f4=new JFrame("huslengiih");
        f4.setResizable(false);
        f4.setTitle("table");
        f4.setVisible(true);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize=(int) tk.getScreenSize().getWidth();
        int ysize=(int) tk.getScreenSize().getHeight();
        f4.setSize(xsize,ysize);
        JTable jt=new JTable();
        jt.setFillsViewportHeight(true);
        JScrollPane jps=new JScrollPane(jt);
        JPanel p=new JPanel();
        JTextField t2=new JTextField("00");
        t2.setBounds(500,40,150,150);
        t2.setFont(new Font("times",Font.BOLD,100));
        t2.setBorder(BorderFactory.createLineBorder(Color.black));
        t2.setBackground(Color.black);
        t2.setForeground(Color.red);
        JTextField t1=new JTextField("00");
        t1.setBounds(750,40,150,150);
        t1.setFont(new Font("times",Font.BOLD,100));
        t1.setBorder(BorderFactory.createLineBorder(Color.black));
        t1.setBackground(Color.black);
        t1.setForeground(Color.red);
        JTextField t3=new JTextField(":"); 
        t3.setBounds(660,5,60,200);
        t3.setFont(new Font("times",Font.BOLD,100));
        t3.setBorder(BorderFactory.createLineBorder(Color.black));
        t3.setBackground(Color.black);
        t3.setForeground(Color.white);
        String s1=t1.getText();
        int a=Integer.parseInt(s1);
        String s2=t2.getText();
        int b=Integer.parseInt(s2); 
        p.setBackground(Color.black);
        JLabel l=new JLabel();
        p.add(jps);
        l.setText(""+(a--));

        p.setLayout(new BorderLayout());
        jps.setBounds(500,40,150,150);
        JButton b444=new JButton("-1");
        b444.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String s1=t1.getText();
                    int a=Integer.parseInt(s1);
                    a=a-1;
                    t1.setText(""+a);

                }
            });

        b444.setBounds(882,810,80,40);
        // b444.setIcon(new ImageIcon("t.png"));
        b444.setBackground(Color.white);
        b444.setForeground(Color.black);
        b444.setFont(new Font("times",Font.BOLD,30));
        JButton b144=new JButton("");
        b144.setIcon(new ImageIcon("t.png"));
        b144.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String s2=t2.getText();
                    int b=Integer.parseInt(s2);
                    b=b+1;
                    t2.setText(""+b);

                }
            });

        b144.setBounds(110,810,80,40);
        b144.setBackground(Color.white);
        b144.setForeground(Color.black);
        b144.setFont(new Font("times",Font.BOLD,30));
        JButton b24=new JButton("");
        b24.setIcon(new ImageIcon("t.png"));
        b24.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String s1=t1.getText();
                    int a=Integer.parseInt(s1);
                    a=a+1;
                    t1.setText(""+a);
                }
            });
        b24.setBounds(972,810,80,40);
        b24.setBackground(Color.white);
        b24.setForeground(Color.black);
        b24.setFont(new Font("times",Font.BOLD,30));
        JButton b34=new JButton("-1");
        b34.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String s2=t2.getText();
                    int b=Integer.parseInt(s2);
                    b=b-1;
                    t2.setText(""+b);

                }
            });
        b34.setBounds(200,810,80,40);
        b34.setBackground(Color.white);
        b34.setForeground(Color.black);
        b34.setFont(new Font("times",Font.BOLD,30));
        JButton jb3=new JButton("start");
        jb3.setFont(new Font("times",Font.BOLD,24));
        jb3.setBounds(743,750,200,50);      
        l.add(jps);
        l.add(t1);
        l.add(t2);
        l.add(t3);
        p.add(b444);
        p.add(b144);
        p.add(b24);
        p.add(b34);
        p.add(jb3);
        p.add(l);
        //l.add(t);
        f4.add(p);
    }

    public static void main()
    {
        new timer();

    }
}