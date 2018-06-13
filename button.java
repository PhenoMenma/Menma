import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class button{
    String[] items={"Zelme","Baynmonh","Uugandorj","Tvmenhvslen"};
    JComboBox c=new JComboBox(items);
    JButton bc=new JButton("print");

    public button(){
        gui(); 
    }

    public void gui()
    {

        JLabel l=new JLabel();//frame ehelj bna
        JLabel l1=new JLabel();
        JFrame f=new JFrame("huslengiih");
        JFrame f2=new JFrame("huslengiih");
        f2.setSize(400,400);
        f.setVisible(true);
        f.setSize(700,900);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("file");
        mb.add(file);
        JMenuItem exit = new JMenuItem("exit");
        file.add(exit);
        JMenuItem option = new JMenuItem("option");
        file.add(option);
        JMenuItem open = new JMenuItem("open");
        file.add(open);
        JMenu tools=new JMenu("tools");
        mb.add(tools);
        JMenuItem ll = new JMenuItem("ll");
        tools.add(ll);
        JMenu edit=new JMenu("edit");
        mb.add(edit);
        JMenuItem gg = new JMenuItem("gg");
        edit.add(gg);//enii frame togsoj bna
        
        JMenuBar mb1=new JMenuBar();// 2 dahi frame ehelj bna
        JMenu fl=new JMenu("file");
        mb1.add(fl);
        JMenuItem e = new JMenuItem("exit");
        file.add(e);
        JMenu t=new JMenu("tools");
        mb1.add(t);
        JMenuItem la = new JMenuItem("ll");
        tools.add(la);
        JMenu ed=new JMenu("edit");
        mb1.add(ed);
        JMenuItem g = new JMenuItem("gg");
        edit.add(g);
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
        open.addActionListener(new ActionListener(){
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
        JButton b15=new JButton("static");  
        JButton b16=new JButton("static");

        p.add(b);
        p.add(c);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(l);
         p1.add(b11);
        p1.add(b12);
        p1.add(b13);
        p1.add(b14);
        p1.add(b15);
        p1.add(b16);
        p1.add(l1);

        p.add(bc);
        f.add(p);
        f.setJMenuBar(mb);
        f2.setJMenuBar(mb1);
        f2.add(p1);

    }

    public static void main()
    {
        new button();

    }

}