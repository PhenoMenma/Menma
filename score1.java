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
        f4.setSize(1370,900);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize=(int) tk.getScreenSize().getWidth();
        int ysize=(int) tk.getScreenSize().getHeight();
        //f4.setSize(xsize,ysize);
        JTable jt=new JTable();
        JTable jt2=new JTable();
        JTable jt3=new JTable();
        JTable jt4=new JTable();
        JTable jt5=new JTable();
        JTable jt6=new JTable();
        JTable jt7=new JTable();
        JTable jt8=new JTable();
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
        t2.setBounds(37,125,515,280);
        t2.setFont(new Font("times",Font.BOLD,320));
        t2.setBorder(BorderFactory.createLineBorder(Color.white));
        t2.setBackground(Color.black);
        t2.setForeground(Color.red);
        JTextField t1=new JTextField("00");
        t1.setBounds(805,125,515,280);
        t1.setFont(new Font("times",Font.BOLD,320));
        t1.setBorder(BorderFactory.createLineBorder(Color.black));
        t1.setBackground(Color.black);
        t1.setForeground(Color.red);
        JTextField t3=new JTextField("HOMETEAM"); 
        t3.setBounds(37,0,600,100);
        t3.setFont(new Font("times",Font.BOLD,80));
        t3.setBorder(BorderFactory.createLineBorder(Color.black));
        t3.setBackground(Color.black);
        t3.setForeground(Color.white);
        JTextField t5=new JTextField("PERIOD"); 
        t5.setBounds(620,110,150,50);
        t5.setFont(new Font("times",Font.BOLD,30));
        t5.setBorder(BorderFactory.createLineBorder(Color.black));
        t5.setBackground(Color.black);
        t5.setForeground(Color.white);
        JTextField t4=new JTextField("VISITORTEAM"); 
        t4.setBounds(800,0,600,100);
        t4.setFont(new Font("times",Font.BOLD,80));
        t4.setBorder(BorderFactory.createLineBorder(Color.black));
        t4.setBackground(Color.black);
        t4.setForeground(Color.white);//scoreboard
        JTextField t7=new JTextField("NERS"); 
        t7.setBounds(1050,470,250,30);
        t7.setFont(new Font("times",Font.PLAIN,24));
        t7.setBorder(BorderFactory.createLineBorder(Color.black));
        t7.setForeground(Color.black);
        t7.setBackground(Color.white);
        JTextField t71=new JTextField("№"); 
        t71.setBounds(1300,470,50,30);
        t71.setFont(new Font("times",Font.PLAIN,24));
        t71.setBorder(BorderFactory.createLineBorder(Color.black));
        t71.setForeground(Color.black);
        t71.setBackground(Color.white);
        JTextField t8=new JTextField("NERS"); 
        t8.setBounds(50,470,250,30);
        t8.setFont(new Font("times",Font.PLAIN,24));
        t8.setBorder(BorderFactory.createLineBorder(Color.black));
        t8.setForeground(Color.black);
        t8.setBackground(Color.white);
          JTextField t81=new JTextField("№"); 
        t81.setBounds(0,470,50,30);
        t81.setFont(new Font("times",Font.PLAIN,24));
        t81.setBorder(BorderFactory.createLineBorder(Color.black));
        t81.setForeground(Color.black);
        t81.setBackground(Color.white);
        JTextField t9=new JTextField("PTS"); 
        t9.setBounds(1000,470,50,30);
        t9.setFont(new Font("times",Font.PLAIN,24));
        t9.setBorder(BorderFactory.createLineBorder(Color.black));
        t9.setForeground(Color.black);
        t9.setBackground(Color.white);
        JTextField t10=new JTextField("PTS"); 
        t10.setBounds(300,470,50,30);
        t10.setFont(new Font("times",Font.PLAIN,24));
        t10.setBorder(BorderFactory.createLineBorder(Color.black));
        t10.setForeground(Color.black);
        t10.setBackground(Color.white);
         JTextField t11=new JTextField("ZEMA"); 
        t11.setBounds(1050,500,250,30);
        t11.setFont(new Font("times",Font.PLAIN,24));
        t11.setBorder(BorderFactory.createLineBorder(Color.black));
        t11.setForeground(Color.black);
        t11.setBackground(Color.white);
         JTextField t111=new JTextField("1"); 
        t111.setBounds(1300,500,50,30);
        t111.setFont(new Font("times",Font.BOLD,30));
        t111.setBorder(BorderFactory.createLineBorder(Color.black));
        t111.setForeground(Color.black);
        t111.setBackground(Color.white);
        JTextField t12=new JTextField("HVSLE"); 
        t12.setBounds(50,500,250,30);
        t12.setFont(new Font("times",Font.PLAIN,24));
        t12.setBorder(BorderFactory.createLineBorder(Color.black));
        t12.setForeground(Color.black);
        t12.setBackground(Color.white);
           JTextField t121=new JTextField("2"); 
        t121.setBounds(0,500,50,30);
        t121.setFont(new Font("times",Font.BOLD,30));
        t121.setBorder(BorderFactory.createLineBorder(Color.black));
        t121.setForeground(Color.black);
        t121.setBackground(Color.white);
        JTextField t13=new JTextField("0"); 
        t13.setBounds(1000,500,50,30);
        t13.setFont(new Font("times",Font.BOLD,30));
        t13.setBorder(BorderFactory.createLineBorder(Color.black));
        t13.setForeground(Color.black);
        t13.setBackground(Color.white);
        JTextField t14=new JTextField("0"); 
        t14.setBounds(300,500,50,30);
        t14.setFont(new Font("times",Font.BOLD,30));
        t14.setBorder(BorderFactory.createLineBorder(Color.black));
        t14.setForeground(Color.black);
        t14.setBackground(Color.white);
         JTextField t15=new JTextField("HVSLE"); 
        t15.setBounds(50,530,250,30);
        t15.setFont(new Font("times",Font.PLAIN,24));
        t15.setBorder(BorderFactory.createLineBorder(Color.black));
        t15.setForeground(Color.black);
        t15.setBackground(Color.white);
           JTextField t151=new JTextField("2"); 
        t151.setBounds(0,530,50,30);
        t151.setFont(new Font("times",Font.BOLD,30));
        t151.setBorder(BorderFactory.createLineBorder(Color.black));
        t151.setForeground(Color.black);
        t151.setBackground(Color.white);
        JTextField t152=new JTextField("0"); 
        t152.setBounds(300,530,50,30);
        t152.setFont(new Font("times",Font.BOLD,30));
        t152.setBorder(BorderFactory.createLineBorder(Color.black));
        t152.setForeground(Color.black);
        t152.setBackground(Color.white);
         JTextField t17=new JTextField("HVSLE"); 
        t17.setBounds(50,560,250,30);
        t17.setFont(new Font("times",Font.PLAIN,24));
        t17.setBorder(BorderFactory.createLineBorder(Color.black));
        t17.setForeground(Color.black);
        t17.setBackground(Color.white);
           JTextField t171=new JTextField("2"); 
        t171.setBounds(0,560,50,30);
        t171.setFont(new Font("times",Font.BOLD,30));
        t171.setBorder(BorderFactory.createLineBorder(Color.black));
        t171.setForeground(Color.black);
        t171.setBackground(Color.white);
        JTextField t172=new JTextField("0"); 
        t172.setBounds(300,560,50,30);
        t172.setFont(new Font("times",Font.BOLD,30));
        t172.setBorder(BorderFactory.createLineBorder(Color.black));
        t172.setForeground(Color.black);
        t172.setBackground(Color.white);
         JTextField t19=new JTextField("HVSLE"); 
        t19.setBounds(50,590,250,30);
        t19.setFont(new Font("times",Font.PLAIN,24));
        t19.setBorder(BorderFactory.createLineBorder(Color.black));
        t19.setForeground(Color.black);
        t19.setBackground(Color.white);
           JTextField t191=new JTextField("2"); 
        t191.setBounds(0,590,50,30);
        t191.setFont(new Font("times",Font.BOLD,30));
        t191.setBorder(BorderFactory.createLineBorder(Color.black));
        t191.setForeground(Color.black);
        t191.setBackground(Color.white);
        JTextField t192=new JTextField("0"); 
        t192.setBounds(300,590,50,30);
        t192.setFont(new Font("times",Font.BOLD,30));
        t192.setBorder(BorderFactory.createLineBorder(Color.black));
        t192.setForeground(Color.black);
        t192.setBackground(Color.white);
         JTextField t24=new JTextField("HVSLE"); 
        t24.setBounds(50,620,250,30);
        t24.setFont(new Font("times",Font.PLAIN,24));
        t24.setBorder(BorderFactory.createLineBorder(Color.black));
        t24.setForeground(Color.black);
        t24.setBackground(Color.white);
           JTextField t241=new JTextField("2"); 
        t241.setBounds(0,620,50,30);
        t241.setFont(new Font("times",Font.BOLD,30));
        t241.setBorder(BorderFactory.createLineBorder(Color.black));
        t241.setForeground(Color.black);
        t241.setBackground(Color.white);
        JTextField t242=new JTextField("0"); 
        t242.setBounds(300,620,50,30);
        t242.setFont(new Font("times",Font.BOLD,30));
        t242.setBorder(BorderFactory.createLineBorder(Color.black));
        t242.setForeground(Color.black);
        t242.setBackground(Color.white);
         JTextField t25=new JTextField("HVSLE"); 
        t25.setBounds(50,650,250,30);
        t25.setFont(new Font("times",Font.PLAIN,24));
        t25.setBorder(BorderFactory.createLineBorder(Color.black));
        t25.setForeground(Color.black);
        t25.setBackground(Color.white);
           JTextField t251=new JTextField("2"); 
        t251.setBounds(0,650,50,30);
        t251.setFont(new Font("times",Font.BOLD,30));
        t251.setBorder(BorderFactory.createLineBorder(Color.black));
        t251.setForeground(Color.black);
        t251.setBackground(Color.white);
        JTextField t252=new JTextField("0"); 
        t252.setBounds(300,650,50,30);
        t252.setFont(new Font("times",Font.BOLD,30));
        t252.setBorder(BorderFactory.createLineBorder(Color.black));
        t252.setForeground(Color.black);
        t252.setBackground(Color.white);
            JTextField t26=new JTextField("HVSLE"); 
        t26.setBounds(50,680,250,30);
        t26.setFont(new Font("times",Font.PLAIN,24));
        t26.setBorder(BorderFactory.createLineBorder(Color.black));
        t26.setForeground(Color.black);
        t26.setBackground(Color.white);
           JTextField t261=new JTextField("2"); 
        t261.setBounds(0,680,50,30);
        t261.setFont(new Font("times",Font.BOLD,30));
        t261.setBorder(BorderFactory.createLineBorder(Color.black));
        t261.setForeground(Color.black);
        t261.setBackground(Color.white);
        JTextField t262=new JTextField("0"); 
        t262.setBounds(300,680,50,30);
        t262.setFont(new Font("times",Font.BOLD,30));
        t262.setBorder(BorderFactory.createLineBorder(Color.black));
        t262.setForeground(Color.black);
        t262.setBackground(Color.white);
        
        
        JTextField t23=new JTextField("ZEMA"); 
        t23.setBounds(1050,530,250,30);
        t23.setFont(new Font("times",Font.PLAIN,24));
        t23.setBorder(BorderFactory.createLineBorder(Color.black));
        t23.setForeground(Color.black);
        t23.setBackground(Color.white);
         JTextField t231=new JTextField("1"); 
        t231.setBounds(1300,530,50,30);
        t231.setFont(new Font("times",Font.BOLD,30));
        t231.setBorder(BorderFactory.createLineBorder(Color.black));
        t231.setForeground(Color.black);
        t231.setBackground(Color.white);
         JTextField t232=new JTextField("0"); 
        t232.setBounds(1000,530,50,30);
        t232.setFont(new Font("times",Font.BOLD,30));
        t232.setBorder(BorderFactory.createLineBorder(Color.black));
        t232.setForeground(Color.black);
        t232.setBackground(Color.white);
        JTextField t16=new JTextField("ZEMA"); 
        t16.setBounds(1050,560,250,30);
        t16.setFont(new Font("times",Font.PLAIN,24));
        t16.setBorder(BorderFactory.createLineBorder(Color.black));
        t16.setForeground(Color.black);
        t16.setBackground(Color.white);
         JTextField t161=new JTextField("1"); 
        t161.setBounds(1300,560,50,30);
        t161.setFont(new Font("times",Font.BOLD,30));
        t161.setBorder(BorderFactory.createLineBorder(Color.black));
        t161.setForeground(Color.black);
        t161.setBackground(Color.white);
         JTextField t162=new JTextField("0"); 
        t162.setBounds(1000,560,50,30);
        t162.setFont(new Font("times",Font.BOLD,30));
        t162.setBorder(BorderFactory.createLineBorder(Color.black));
        t162.setForeground(Color.black);
        t162.setBackground(Color.white);
        JTextField t18=new JTextField("ZEMA"); 
        t18.setBounds(1050,590,250,30);
        t18.setFont(new Font("times",Font.PLAIN,24));
        t18.setBorder(BorderFactory.createLineBorder(Color.black));
        t18.setForeground(Color.black);
        t18.setBackground(Color.white);
         JTextField t181=new JTextField("1"); 
        t181.setBounds(1300,590,50,30);
        t181.setFont(new Font("times",Font.BOLD,30));
        t181.setBorder(BorderFactory.createLineBorder(Color.black));
        t181.setForeground(Color.black);
        t181.setBackground(Color.white);
         JTextField t182=new JTextField("0"); 
        t182.setBounds(1000,590,50,30);
        t182.setFont(new Font("times",Font.BOLD,30));
        t182.setBorder(BorderFactory.createLineBorder(Color.black));
        t182.setForeground(Color.black);
        t182.setBackground(Color.white);
         JTextField t20=new JTextField("ZEMA"); 
        t20.setBounds(1050,620,250,30);
        t20.setFont(new Font("times",Font.PLAIN,24));
        t20.setBorder(BorderFactory.createLineBorder(Color.black));
        t20.setForeground(Color.black);
        t20.setBackground(Color.white);
         JTextField t201=new JTextField("1"); 
        t201.setBounds(1300,620,50,30);
        t201.setFont(new Font("times",Font.BOLD,30));
        t201.setBorder(BorderFactory.createLineBorder(Color.black));
        t201.setForeground(Color.black);
        t201.setBackground(Color.white);
         JTextField t202=new JTextField("0"); 
        t202.setBounds(1000,620,50,30);
        t202.setFont(new Font("times",Font.BOLD,30));
        t202.setBorder(BorderFactory.createLineBorder(Color.black));
        t202.setForeground(Color.black);
        t202.setBackground(Color.white);
         JTextField t21=new JTextField("ZEMA"); 
        t21.setBounds(1050,650,250,30);
        t21.setFont(new Font("times",Font.PLAIN,24));
        t21.setBorder(BorderFactory.createLineBorder(Color.black));
        t21.setForeground(Color.black);
        t21.setBackground(Color.white);
         JTextField t211=new JTextField("1"); 
        t211.setBounds(1300,650,50,30);
        t211.setFont(new Font("times",Font.BOLD,30));
        t211.setBorder(BorderFactory.createLineBorder(Color.black));
        t211.setForeground(Color.black);
        t211.setBackground(Color.white);
         JTextField t212=new JTextField("0"); 
        t212.setBounds(1000,650,50,30);
        t212.setFont(new Font("times",Font.BOLD,30));
        t212.setBorder(BorderFactory.createLineBorder(Color.black));
        t212.setForeground(Color.black);
        t212.setBackground(Color.white);
            JTextField t22=new JTextField("ZEMA"); 
        t22.setBounds(1050,680,250,30);
        t22.setFont(new Font("times",Font.PLAIN,24));
        t22.setBorder(BorderFactory.createLineBorder(Color.black));
        t22.setForeground(Color.black);
        t22.setBackground(Color.white);
         JTextField t221=new JTextField("1"); 
        t221.setBounds(1300,680,50,30);
        t221.setFont(new Font("times",Font.BOLD,30));
        t221.setBorder(BorderFactory.createLineBorder(Color.black));
        t221.setForeground(Color.black);
        t221.setBackground(Color.white);
         JTextField t222=new JTextField("0"); 
        t222.setBounds(1000,680,50,30);
        t222.setFont(new Font("times",Font.BOLD,30));
        t222.setBorder(BorderFactory.createLineBorder(Color.black));
        t222.setForeground(Color.black);
        t222.setBackground(Color.white);
             
        JTextField t6=new JTextField("00"); 
        t6.setBounds(640,170,90,180);
        t6.setFont(new Font("times",Font.BOLD,160));
        t6.setBorder(BorderFactory.createLineBorder(Color.white));
        t6.setBackground(Color.white);
        t6.setForeground(Color.black);
        String s1=t1.getText();
        int a=Integer.parseInt(s1);
        String s2=t2.getText();
        int b=Integer.parseInt(s2); 
        String s3=t13.getText();
        int c=Integer.parseInt(s3);
        String s4=t14.getText();
        int d=Integer.parseInt(s4); 
        p4.setBackground(Color.black);
        JLabel l4=new JLabel();
        //l4.setIcon(new ImageIcon("score.jpg"));
        jt.setFillsViewportHeight(true);
        JScrollPane jps=new JScrollPane(jt);
        jt2.setFillsViewportHeight(true);
        JScrollPane jps2=new JScrollPane(jt2);
        jt7.setFillsViewportHeight(true);
        JScrollPane jps7=new JScrollPane(jt7);
        jt8.setFillsViewportHeight(true);
        JScrollPane jps8=new JScrollPane(jt8);

        p4.setLayout(new BorderLayout());
        jps.setBounds(27,115,535,300);
        jps3.setBounds(37,0,600,100);
        jps4.setBounds(800,0,600,100);
        jps2.setBounds(795,115,535,300);
        jps5.setBounds(620,110,150,50);
        jps6.setBounds(640,170,90,180);
        jps7.setBounds(1000,470,350,210);
        jps8.setBounds(0,470,350,210);
        p4.add(jps2);
        p4.add(jps);
        p4.add(jps3);
        p4.add(jps4);
        p4.add(jps5);
        p4.add(jps6);
        p4.add(jps7);
        p4.add(jps8);
        JButton jb=new JButton("1");
        jb.setFont(new Font("times",Font.BOLD,24));
        jb.setBounds(563,360,50,50);
        JButton jb1=new JButton("2");
        jb1.setFont(new Font("times",Font.BOLD,24));
        jb1.setBounds(623,360,50,50);
        JButton jb2=new JButton("3");
        jb2.setFont(new Font("times",Font.BOLD,24));
        jb2.setBounds(683,360,50,50);
        JButton jb3=new JButton("4");
        jb3.setFont(new Font("times",Font.BOLD,24));
        jb3.setBounds(743,360,50,50);
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
                    t6.setBounds(640,170,90,180);
                    t6.setFont(new Font("times",Font.BOLD,160));
                    t6.setBorder(BorderFactory.createLineBorder(Color.white));
                    t6.setBackground(Color.white);
                    t6.setForeground(Color.black);
                    jps6.setBounds(640,170,90,180);
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
                    t6.setBounds(640,170,90,180);
                    t6.setFont(new Font("times",Font.BOLD,160));
                    t6.setBorder(BorderFactory.createLineBorder(Color.white));
                    t6.setBackground(Color.white);
                    t6.setForeground(Color.black);
                    jps6.setBounds(640,170,90,180);
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
                    t6.setBounds(640,170,90,180);
                    t6.setFont(new Font("times",Font.BOLD,160));
                    t6.setBorder(BorderFactory.createLineBorder(Color.white));
                    t6.setBackground(Color.white);
                    t6.setForeground(Color.black);
                    jps6.setBounds(640,170,90,180);
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
                    t6.setBounds(640,170,90,180);
                    t6.setFont(new Font("times",Font.BOLD,160));
                    t6.setBorder(BorderFactory.createLineBorder(Color.white));
                    t6.setBackground(Color.white);
                    t6.setForeground(Color.black);
                    jps6.setBounds(640,170,90,180);
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
                    String s3=t13.getText();
                    int c=Integer.parseInt(s3); 
                    c=c-1;
                    t13.setText(""+c);
                    

                }
            });
        b444.setBounds(882,420,80,40);
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
           
                    String s4=t14.getText();
                    int d=Integer.parseInt(s4); 
                    d=d+3;
                    t14.setText(""+d);

                }
            });
        b144.setBounds(110,420,80,40);
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
                      String s3=t13.getText();
                    int c=Integer.parseInt(s3); 
                    c=c+1;
                    t13.setText(""+c);

                }
            });
        b24.setBounds(972,420,80,40);
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
                       String s4=t14.getText();
                    int d=Integer.parseInt(s4); 
                    d=d+2;
                    t14.setText(""+d);

                }
            });
        b34.setBounds(200,420,80,40);
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
                      String s3=t13.getText();
                    int c=Integer.parseInt(s3); 
                    c=c+2;
                    t13.setText(""+c);

                }
            });
        b44.setBounds(1062,420,80,40);
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
                           String s4=t14.getText();
                    int d=Integer.parseInt(s4); 
                    d=d+1;
                    t14.setText(""+d);

                }
            });
        b54.setBounds(290,420,80,40);
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
                           String s4=t14.getText();
                    int d=Integer.parseInt(s4); 
                    d=d-1;
                    t14.setText(""+d);

                }
            });
        b64.setBounds(380,420,80,40);
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
                           String s3=t13.getText();
                    int c=Integer.parseInt(s3); 
                    c=c+3;
                    t13.setText(""+c);

                }
            });
        b74.setBounds(1152,420,80,40);
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
        l4.add(t7);
        l4.add(t8);
         l4.add(t71);
        l4.add(t81);
        l4.add(t9);
        l4.add(t10);
        l4.add(t11);
        l4.add(t12);
          l4.add(t111);
        l4.add(t121);
        l4.add(t13);
        l4.add(t14);
        l4.add(t151);
        l4.add(t152);
        l4.add(t15);
         l4.add(t161);
        l4.add(t162);
        l4.add(t16);
         l4.add(t171);
        l4.add(t172);
        l4.add(t17);
         l4.add(t181);
        l4.add(t182);
        l4.add(t18);
        l4.add(t191);
        l4.add(t192);
        l4.add(t19);
        l4.add(t201);
        l4.add(t202);
        l4.add(t20);
        l4.add(t221);
        l4.add(t222);
        l4.add(t22);
         l4.add(t211);
        l4.add(t212);
        l4.add(t21);
         l4.add(t231);
        l4.add(t232);
        l4.add(t23);
        
        l4.add(t241);
        l4.add(t242);
        l4.add(t24);
         l4.add(t251);
        l4.add(t252);
        l4.add(t25);
         l4.add(t261);
        l4.add(t262);
        l4.add(t26);
        
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