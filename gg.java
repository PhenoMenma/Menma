import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
import javax.swing.JScrollPane;
public class gg
{
    String s1;
    String s2;
    public gg()
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

        JPanel p4=new JPanel();
        p4.setBackground(Color.black);

        JTextField t3=new JTextField(""); 
        t3.setBounds(17,390,500,100);
        t3.setFont(new Font("times",Font.BOLD,70));
        t3.setBorder(BorderFactory.createLineBorder(Color.black));
        t3.setBackground(Color.black);
        t3.setForeground(Color.white);
        JTextField t4=new JTextField(""); 
        t4.setBounds(880,390,500,100);
        t4.setFont(new Font("times",Font.BOLD,70));
        t4.setBorder(BorderFactory.createLineBorder(Color.black));
        t4.setBackground(Color.black);
        t4.setForeground(Color.white);
        s1=t3.getText();
        s2=t4.getText();
        JLabel l4=new JLabel();
        //l4.setIcon(new ImageIcon("score.jpg"));

        p4.setLayout(new BorderLayout());
        JButton jb=new JButton("next");
        jb.setFont(new Font("times",Font.BOLD,40));
        jb.setBounds(550,750,300,50);
        jb.setBorder(BorderFactory.createLineBorder(Color.black));
        jb.setBackground(Color.black);
        jb.setForeground(Color.white);
        jb.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){                
                    t3.setText(""+s2);
                    t4.setText(""+s1);
                }
            });
        JButton jb1=new JButton("");
        jb1.setFont(new Font("times",Font.BOLD,24));
        jb1.setBounds(540,340,260,260);
        jb1.setIcon(new ImageIcon("vs.jpg"));
        jb1.setBorder(BorderFactory.createLineBorder(Color.black));
        jb1.setBackground(Color.black);
        jb1.setForeground(Color.black);

        p4.add(jb);
        p4.add(jb1);
        l4.add(t4);
        l4.add(t3);
        p4.add(l4);
        //l.add(t);
        f4.add(p4);

    }

    public static void main()
    {
        new gg();   
    }
}