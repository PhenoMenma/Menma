import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
import javax.swing.JScrollPane;
public class score1
{
    public score1()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f4=new JFrame("huslengiih");
        f4.setResizable(false);
        f4.setTitle("table");
        f4.setVisible(true);

        //f4.setSize(1350,900);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize=(int) tk.getScreenSize().getWidth();
        int ysize=(int) tk.getScreenSize().getHeight();
        f4.setSize(xsize,ysize);

        JTable jt=new JTable();
        JTable jt2=new JTable();
        JTable jt3=new JTable();
        JTable jt4=new JTable();
        JTable jt5=new JTable();
        JTable jt6=new JTable();
        jt6.setFillsViewportHeight(true);
        JScrollPane jps6=new JScrollPane(jt6);
        jt5.setFillsViewportHeight(true);
        JScrollPane jps5=new JScrollPane(jt5);
        jt3.setFillsViewportHeight(true);
        JScrollPane jps3=new JScrollPane(jt3);
        jt4.setFillsViewportHeight(true);
        JScrollPane jps4=new JScrollPane(jt4);
        JPanel p4=new JPanel();
        JTextField t2=new JTextField("00");
        t2.setBounds(37,515,515,280);
        t2.setFont(new Font("times",Font.BOLD,320));
        t2.setBorder(BorderFactory.createLineBorder(Color.white));
        t2.setBackground(Color.black);
        t2.setForeground(Color.red);
        JTextField t1=new JTextField("00");
        t1.setBounds(805,515,515,280);
        t1.setFont(new Font("times",Font.BOLD,320));
        t1.setBorder(BorderFactory.createLineBorder(Color.black));
        t1.setBackground(Color.black);
        t1.setForeground(Color.red);
        JTextField t3=new JTextField("HOMETEAM"); 
        t3.setBounds(37,390,600,100);
        t3.setFont(new Font("times",Font.BOLD,80));
        t3.setBorder(BorderFactory.createLineBorder(Color.black));
        t3.setBackground(Color.black);
        t3.setForeground(Color.white);
        JTextField t5=new JTextField("PERIOD"); 
        t5.setBounds(620,500,150,50);
        t5.setFont(new Font("times",Font.BOLD,30));
        t5.setBorder(BorderFactory.createLineBorder(Color.black));
        t5.setBackground(Color.black);
        t5.setForeground(Color.white);
        JTextField t4=new JTextField("VISITORTEAM"); 
        t4.setBounds(800,390,600,100);
        t4.setFont(new Font("times",Font.BOLD,80));
        t4.setBorder(BorderFactory.createLineBorder(Color.black));
        t4.setBackground(Color.black);
        t4.setForeground(Color.white);
        JTextField t6=new JTextField("0"); 
        t6.setBounds(640,560,90,180);
        t6.setFont(new Font("times",Font.BOLD,160));
        t6.setBorder(BorderFactory.createLineBorder(Color.white));
        t6.setBackground(Color.white);
        t6.setForeground(Color.black);
        String s1=t1.getText();
        int a=Integer.parseInt(s1);
        String s2=t2.getText();
        int b=Integer.parseInt(s2); 
        p4.setBackground(Color.black);
        JLabel l4=new JLabel();

        //l4.setIcon(new ImageIcon("score.jpg"));
        jt.setFillsViewportHeight(true);
        JScrollPane jps=new JScrollPane(jt);
        jt2.setFillsViewportHeight(true);
        JScrollPane jps2=new JScrollPane(jt2);

        p4.add(jps2);
        p4.add(jps);
        p4.add(jps3);
        p4.add(jps4);
        p4.add(jps5);
        p4.add(jps6);

        p4.setLayout(new BorderLayout());
        jps.setBounds(27,505,535,300);
        jps3.setBounds(37,390,600,100);
        jps4.setBounds(800,390,600,100);
        jps2.setBounds(795,505,535,300);
        jps5.setBounds(620,500,150,50);
        jps6.setBounds(640,560,90,180);
        JButton jb=new JButton("1");
        jb.setFont(new Font("times",Font.BOLD,24));
        jb.setBounds(563,750,50,50);
        JButton jb1=new JButton("2");
        jb1.setFont(new Font("times",Font.BOLD,24));
        jb1.setBounds(623,750,50,50);
        JButton jb2=new JButton("3");
        jb2.setFont(new Font("times",Font.BOLD,24));
        jb2.setBounds(683,750,50,50);
        JButton jb3=new JButton("4");
        jb3.setFont(new Font("times",Font.BOLD,24));
        jb3.setBounds(743,750,50,50);
        jb.setBackground(Color.white);
        jb.setForeground(Color.black);
        jb1.setBackground(Color.white);
        jb1.setForeground(Color.black);
        jb2.setBackground(Color.white);
        jb2.setForeground(Color.black);
        jb3.setBackground(Color.white);
        jb3.setForeground(Color.black);
        jb.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    jb.setBackground(Color.orange);
                    jb.setForeground(Color.black);
                    jb1.setBackground(Color.white);
                    jb1.setForeground(Color.black);
                    jb2.setBackground(Color.white);
                    jb2.setForeground(Color.black);
                    jb3.setBackground(Color.white);
                    jb3.setForeground(Color.black);
                    JTextField t6=new JTextField("1"); 
                    t6.setBounds(640,560,90,180);
                    t6.setFont(new Font("times",Font.BOLD,160));
                    t6.setBorder(BorderFactory.createLineBorder(Color.white));
                    t6.setBackground(Color.white);
                    t6.setForeground(Color.black);
                    jps6.setBounds(640,560,90,180);
                     p4.add(jps6);
                      l4.add(t6);

                }
            });

        jb1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    jb.setBackground(Color.white);
                    jb.setForeground(Color.black);
                    jb1.setBackground(Color.orange);
                    jb1.setForeground(Color.black);
                    jb2.setBackground(Color.white);
                    jb2.setForeground(Color.black);
                    jb3.setBackground(Color.white);
                    jb3.setForeground(Color.black);
                    JTextField t6=new JTextField("2"); 
                    t6.setBounds(640,560,90,180);
                    t6.setFont(new Font("times",Font.BOLD,160));
                    t6.setBorder(BorderFactory.createLineBorder(Color.white));
                    t6.setBackground(Color.white);
                    t6.setForeground(Color.black);
                    jps6.setBounds(640,560,90,180);
                     p4.add(jps6);
                      l4.add(t6);

                }
            });

        jb2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    jb.setBackground(Color.white);
                    jb.setForeground(Color.black);
                    jb1.setBackground(Color.white);
                    jb1.setForeground(Color.black);
                    jb2.setBackground(Color.orange);
                    jb2.setForeground(Color.black);
                    jb3.setBackground(Color.white);
                    jb3.setForeground(Color.black);
                    JTextField t6=new JTextField("3"); 
                    t6.setBounds(640,560,90,180);
                    t6.setFont(new Font("times",Font.BOLD,160));
                    t6.setBorder(BorderFactory.createLineBorder(Color.white));
                    t6.setBackground(Color.white);
                    t6.setForeground(Color.black);
                    jps6.setBounds(640,560,90,180);
                     p4.add(jps6);
                      l4.add(t6);

                }
            });

        jb3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    jb.setBackground(Color.white);
                    jb.setForeground(Color.black);
                    jb1.setBackground(Color.white);
                    jb1.setForeground(Color.black);
                    jb2.setBackground(Color.white);
                    jb2.setForeground(Color.black);
                    jb3.setBackground(Color.orange);
                    jb3.setForeground(Color.black);
                    JTextField t6=new JTextField("4"); 
                    t6.setBounds(640,560,90,180);
                    t6.setFont(new Font("times",Font.BOLD,160));
                    t6.setBorder(BorderFactory.createLineBorder(Color.white));
                    t6.setBackground(Color.white);
                    t6.setForeground(Color.black);
                    jps6.setBounds(640,560,90,180);
                     p4.add(jps6);
                      l4.add(t6);

                }
            });
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
        b444.setBackground(Color.white);
        b444.setForeground(Color.black);
        b444.setFont(new Font("times",Font.BOLD,30));
        JButton b144=new JButton("+3");
        b144.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String s2=t2.getText();
                    int b=Integer.parseInt(s2);
                    b=b+3;
                    t2.setText(""+b);

                }
            });
        b144.setBounds(110,810,80,40);
        b144.setBackground(Color.white);
        b144.setForeground(Color.black);
        b144.setFont(new Font("times",Font.BOLD,30));
        JButton b24=new JButton("+1");
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
        JButton b34=new JButton("+2");
        b34.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String s2=t2.getText();
                    int b=Integer.parseInt(s2);
                    b=b+2;
                    t2.setText(""+b);

                }
            });
        b34.setBounds(200,810,80,40);
        b34.setBackground(Color.white);
        b34.setForeground(Color.black);
        b34.setFont(new Font("times",Font.BOLD,30));
        JButton b44=new JButton("+2");
        b44.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String s1=t1.getText();
                    int a=Integer.parseInt(s1);
                    a=a+2;
                    t1.setText(""+a);

                }
            });
        b44.setBounds(1062,810,80,40);
        b44.setBackground(Color.white);
        b44.setForeground(Color.black);
        b44.setFont(new Font("times",Font.BOLD,30));
        JButton b54=new JButton("+1");
        b54.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String s2=t2.getText();
                    int b=Integer.parseInt(s2);
                    b=b+1;
                    t2.setText(""+b);

                }
            });
        b54.setBounds(290,810,80,40);
        b54.setBackground(Color.white);
        b54.setForeground(Color.black);
        b54.setFont(new Font("times",Font.BOLD,30));
        JButton b64=new JButton("-1");
        b64.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String s2=t2.getText();
                    int b=Integer.parseInt(s2);
                    b=b-1;
                    t2.setText(""+b);

                }
            });
        b64.setBounds(380,810,80,40);
        b64.setBackground(Color.white);
        b64.setForeground(Color.black);
        b64.setFont(new Font("times",Font.BOLD,30));
        JButton b74=new JButton("+3");
        b74.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String s1=t1.getText();
                    int a=Integer.parseInt(s1);
                    a=a+3;
                    t1.setText(""+a);

                }
            });
        b74.setBounds(1152,810,80,40);
        b74.setBackground(Color.white);
        b74.setForeground(Color.black);
        b74.setFont(new Font("times",Font.BOLD,30));

        l4.add(jps);

        l4.add(t1);
        l4.add(t2);
        l4.add(t3);
        l4.add(t4);
        l4.add(t5);
        l4.add(t6);
        p4.add(b444);
        p4.add(jb);
        p4.add(jb1);
        p4.add(jb2);
        p4.add(jb3);
        p4.add(b144);
        p4.add(b24);
        p4.add(b34);
        p4.add(b44);
        p4.add(b54);
        p4.add(b64);
        p4.add(b74);
        p4.add(l4);

        //l.add(t);
        f4.add(p4);

    }

    public static void main()
    {
        new score1();

    }
}