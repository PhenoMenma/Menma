import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
import javax.swing.JScrollPane;
public class score1
{
    public score1()
    {
        String[] columns={"     home     ","Visitor"};
        String[][] data={{"              ","       "},};
        JTable jt=new JTable(data,columns);
        JPanel p4=new JPanel();
         p4.setBackground(Color.black);
        JLabel l4=new JLabel();
        jt.setFillsViewportHeight(true);
        JScrollPane jps=new JScrollPane(jt);
        p4.add(jps);
        JFrame f4=new JFrame("huslengiih");

        f4.setResizable(false);
        f4.setTitle("table");
        f4.setVisible(true);
        f4.setSize(900,900);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f4.add(p4);
          p4.setLayout(new BorderLayout());
        jps.setBounds(95,200,710,400);
        JButton b444=new JButton("+3");
        b444.setBounds(820,230,80,40);
        b444.setBackground(Color.white);
        JButton b144=new JButton("+3");
        b144.setBounds(0,230,80,40);
        b144.setBackground(Color.white);
        JButton b24=new JButton("+2");
        b24.setBounds(820,280,80,40);
        b24.setBackground(Color.white);             
        JButton b34=new JButton("+2");
        b34.setBounds(0,280,80,40);
        b34.setBackground(Color.white);
        JButton b44=new JButton("+1");
        b44.setBounds(820,330,80,40);
        b44.setBackground(Color.white);
        JButton b54=new JButton("+1");
        b54.setBounds(0,330,80,40);
        b54.setBackground(Color.white);
        JButton b64=new JButton("-1");
        b64.setBounds(0,380,80,40);
        b64.setBackground(Color.white);
        JButton b74=new JButton("-1");
        b74.setBounds(820,380,80,40);
        b74.setBackground(Color.white);
        JMenuBar mb4=new JMenuBar();
        JMenu file=new JMenu("file");
        mb4.add(file);

        file.setIcon(new ImageIcon("ficon.png"));
        JMenu exit=new JMenu("exit");
        file.add(exit);

        exit.setIcon(new ImageIcon("e.png"));
        exit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);

                }
            });
        l4.add(jps);
        p4.add(b444);
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

        f4.setJMenuBar(mb4);

    }

    public static void main()
    {
        new score1();

    }
}