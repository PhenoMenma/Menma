import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class button{

    public ImageIcon g1;
    public JLabel l1;

    public button(){
        gui(); 
    }

    public void gui()
    {
        String[] items={"Zelme","Baynmonh","Uugandorj","Tvmenhvslen","ff","ff","ff","ff","ff","ff"};
        JComboBox c=new JComboBox(items);

        JLabel l=new JLabel();//frame ehelj bna
        JLabel l1=new JLabel();
        l1.setIcon(new ImageIcon("c:\\10529dd.jpg"));
        JFrame f=new JFrame("huslengiih");
        JFrame f2=new JFrame("huslengiih");
        f2.setSize(1360,768);
        f2.setResizable(false);
        f.setResizable(false);
        f.setVisible(true);
        f.setSize(1360,768);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLocationRelativeTo(null);
        JMenuBar mb1=new JMenuBar();
        JMenu file=new JMenu("file");
        mb1.add(file);
        JMenuItem exit = new JMenuItem("exit");
        file.add(exit);
        JMenuItem option = new JMenuItem("option");
        file.add(option);
        JMenuItem open = new JMenuItem("open");
        file.add(open);
        JMenu tools=new JMenu("tools");
        mb1.add(tools);
        JMenuItem ll = new JMenuItem("ll");
        tools.add(ll);
        JMenu edit=new JMenu("edit");
        mb1.add(edit);
        JMenuItem gg = new JMenuItem("gg");
        edit.add(gg);//enii frame togsoj bna

        JMenuBar mb=new JMenuBar();// 2 dahi frame ehelj bna
        JMenu fl=new JMenu("file");
        mb.add(fl);
        JMenuItem e = new JMenuItem("exit");
        file.add(e);
        JMenu t=new JMenu("tools");
        mb.add(t);
        JMenuItem la = new JMenuItem("ll");
        t.add(la);
        JMenu ed=new JMenu("edit");
        mb.add(ed);
        JMenuItem g = new JMenuItem("gg");
        ed.add(g);
        //2 dahi frame togsoj bna

        JPanel p=new JPanel();

        JPanel p1=new JPanel();
        p1.setBackground(Color.YELLOW);
        JButton b=new JButton("Action listener");
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(null,"Action Listener is working");

                }
            });

        JButton b1=new JButton("static");
        JButton b2=new JButton("static");
        JButton b3=new JButton("static");
        JButton b4=new JButton("static");
        JButton b5=new JButton("static");  
        JButton b6=new JButton("static");
        JButton b11=new JButton("static");
        JButton b12=new JButton("static");
        JButton b13=new JButton("static");
        JButton b14=new JButton("static");
        JButton b16=new JButton("static");
        JButton b15=new JButton("start"); 
        JButton bc=new JButton("print");
        b15.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    f2.setVisible(true);

                }
            });
        bc.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String s=c.getSelectedItem().toString();
                    l.setText(s);

                }
            });

        p.setLayout(new BorderLayout());
        p1.setLayout(new BorderLayout());

        p.add(b);
        b.setBounds(0,280,90,30);
        b.setBackground(Color.white);
        l.add(c);
        bc.setBounds(0,320,90,30);
        bc.setBackground(Color.white);
        p.add(b1);
        b1.setBounds(0,10,90,30);
        b1.setBackground(Color.white);
        p.add(b2);
        b2.setBounds(0,50,90,30);
        b2.setBackground(Color.white);
        p.add(b3);
        b3.setBounds(0,90,90,30);
        b3.setBackground(Color.white);
        p.add(b4);
        b4.setBounds(0,120,90,30);
        b4.setBackground(Color.white);
        p.add(b5);
        b5.setBounds(0,160,90,30);
        b5.setBackground(Color.white);
        p.add(b6);
        b6.setBounds(0,200,90,30);
        b6.setBackground(Color.white);
        p.add(l);
        p1.add(b11);
        p1.add(b12);
        p1.add(b13);
        p1.add(b14);
        p1.add(b15);

        b15.setBounds(0,100,90,30);
        b15.setBackground(Color.white);
        p1.add(b16);

        b16.setBounds(0,60,90,30);
        b15.setBackground(Color.white);
        p1.add(l1);

        l.add(bc);
          bc.setBounds(0,240,90,30);
        bc.setBackground(Color.white);
        f2.add(p);
        f2.setJMenuBar(mb);
        f.setJMenuBar(mb1);
        f.add(p1);

    }

    public static void main()
    {
        new button();

    }

}