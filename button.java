
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
import javax.swing.JScrollPane;
public class button  {

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
                l.setIcon(new ImageIcon("gg.jpg"));

        l1.setIcon(new ImageIcon("cc.png"));
        JFrame f=new JFrame("huslengiih");
        JFrame f2=new JFrame("huslengiih");
        f2.setSize(640,400);
        f2.setResizable(false);
        f.setResizable(false);
        f.setVisible(true);
        f.setSize(595,596);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columns={"     Player     ","P","PTS","REB","AST","STL","BLK","FG%","3P%","FT%","TOV"};
        String[][] data={{"                ","","","","","","","","","",""},
                         {"                ","","","","","","","","","",""},
                         {"                ","","","","","","","","","",""},
                         {"                ","","","","","","","","","",""},
                         {"                ","","","","","","","","","",""},};
        JTable jt=new JTable(data,columns);
        JPanel p3=new JPanel();
        jt.setPreferredScrollableViewportSize(new Dimension(900,63));
        jt.setFillsViewportHeight(true);
        JScrollPane jps=new JScrollPane(jt);
        p3.add(jps);
        JFrame f3=new JFrame("huslengiih");

        f3.setResizable(false);
        f3.setTitle("Box Score");
        
        f3.setSize(900,900);
        
        f3.add(p3);

        f.setLocationRelativeTo(null);
        JMenuBar mb1=new JMenuBar();
        JMenu file=new JMenu("file");
        mb1.add(file);

        file.setIcon(new ImageIcon("ficon.png"));

        JMenuItem option = new JMenuItem("option");
        file.add(option);
        option.setIcon(new ImageIcon("opicon.png"));
        JMenuItem open = new JMenuItem("open");
        file.add(open);
        open.setIcon(new ImageIcon("oicon.png"));
        JMenu tools=new JMenu("tools");
        mb1.add(tools);
        tools.setIcon(new ImageIcon("ticon.png"));
        JMenuItem ll = new JMenuItem("ll");
        tools.add(ll);
        JMenu edit=new JMenu("edit");
        mb1.add(edit);
        edit.setIcon(new ImageIcon("edicon.png"));
        JMenuItem gg = new JMenuItem("gg");
        edit.add(gg);
        JMenuItem exit = new JMenuItem("exit");
        file.add(exit);//enii frame togsoj bna
        exit.setIcon(new ImageIcon("e.png"));

        JMenuBar mb=new JMenuBar();// 2 dahi frame ehelj bna
        JMenu fl=new JMenu("file");
        mb.add(fl);
        fl.setIcon(new ImageIcon("ficon.png"));
        JMenuItem e = new JMenuItem("exit");
        fl.add(e);
        e.setIcon(new ImageIcon("e.png"));
        e.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);

                }
            });
        JMenu t=new JMenu("tools");
        mb.add(t);
        t.setIcon(new ImageIcon("ticon.png"));
        JMenuItem la = new JMenuItem("ll");
        t.add(la);
        JMenu ed=new JMenu("edit");
        mb.add(ed);
        ed.setIcon(new ImageIcon("edicon.png"));
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
        JButton b3=new JButton("Box Score");
        b3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    f3.setVisible(true);
                    
                     

                }
            });
        JButton b4=new JButton("static");
        JButton b5=new JButton("static");  
        JButton b6=new JButton("static");
        JButton b11=new JButton("static");
        JButton b12=new JButton("static");
        JButton b13=new JButton("static");
        JButton b14=new JButton("Quit");
        JButton b16=new JButton("static");
        JButton b15=new JButton("start"); 
        b15.setIcon(new ImageIcon("c:\\sicon.png"));
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

        exit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);

                }
            });

        p.setLayout(new BorderLayout());
        p1.setLayout(new BorderLayout());

        p.add(b);
        b.setBounds(250,0,120,30);
        b.setBackground(Color.white);
        l.add(c);
        c.setBounds(0,0,90,30);
        c.setBackground(Color.white);
       // p.add(b1);
        b1.setBounds(105,0,90,30);
        b1.setBackground(Color.white);
        //p.add(b2);
        b2.setBounds(200,0,90,30);
        b2.setBackground(Color.white);
        p.add(b3);
        b3.setBounds(105,0,120,30);
        b3.setBackground(Color.blue);
        // p.add(b4);
        b4.setBounds(390,0,90,30);
        b4.setBackground(Color.white);
        // p.add(b5);
        //  b5.setBounds(485,0,90,30);
        b5.setBackground(Color.white);
        // p.add(b6);
        b6.setBounds(580,0,90,30);
        b6.setBackground(Color.white);
        p.add(l);
        p1.add(b11);
        p1.add(b12);
        p1.add(b13);
        p1.add(b14);
        p1.add(b15);

        b15.setBounds(0,140,130,50);
        b15.setBackground(Color.white);
        p1.add(b16);

        b16.setBounds(0,80,130,50);
        b16.setBackground(Color.white);
         b14.setBounds(0,200,130,50);
        b14.setBackground(Color.white);
          b14.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);

                }
            });
        p1.add(l1);

        l.add(bc);
        bc.setBounds( 400,0,90,30);
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