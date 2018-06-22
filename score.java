import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTable;

public class score 
{
    public score()
    {
        Score();
    }

    public void Score()
    {
        
        JTable t;
        String[]columns={"HOME TEAM","VISITOR TEAM"};

        String[][] data ={{"        ","         "}};
        t=new JTable(data,columns);
        //t.setSize(500,500);

        //t.setPreferredScrollableViewportSize(new Dimension(595,596));
        t.setFillsViewportHeight(true);
        JScrollPane jps=new JScrollPane(t);
       
         String[] acolumns={"     Player     ","P","PTS","REB","AST","STL","BLK","FG%","3P%","FT%","TOV"};
        String[][] adata={{"                ","","","","","","","","","",""},
                         {"                ","","","","","","","","","",""},
                         {"                ","","","","","","","","","",""},
                         {"                ","","","","","","","","","",""},
                         {"                ","","","","","","","","","",""},};
        JTable jt=new JTable(adata,acolumns);
        JPanel p3=new JPanel();
        jt.setPreferredScrollableViewportSize(new Dimension(900,63));
        jt.setFillsViewportHeight(true);
        JScrollPane ps=new JScrollPane(jt);
        p3.add(ps);
       
        

        JLabel l=new JLabel();//frame ehelj bna
        JPanel p=new JPanel();
        p.setBackground(Color.black);
         p.add(t);
        JFrame f4=new JFrame("huslengiih");
        f4.setResizable(false);
        f4.setVisible(true);
        f4.setSize(900,900);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(new BorderLayout());
        jps.setBounds(95,200,710,400);
        JButton b=new JButton("+3");
        b.setBounds(820,230,80,40);
        b.setBackground(Color.white);
        JButton b1=new JButton("+3");
        b1.setBounds(0,230,80,40);
        b1.setBackground(Color.white);
        JButton b2=new JButton("+2");
        b2.setBounds(820,280,80,40);
        b2.setBackground(Color.white);             
        JButton b3=new JButton("+2");
        b3.setBounds(0,280,80,40);
        b3.setBackground(Color.white);
        JButton b4=new JButton("+1");
        b4.setBounds(820,330,80,40);
        b4.setBackground(Color.white);
        JButton b5=new JButton("+1");
        b5.setBounds(0,330,80,40);
        b5.setBackground(Color.white);
        JButton b6=new JButton("-1");
        b6.setBounds(0,380,80,40);
        b6.setBackground(Color.white);
        JButton b7=new JButton("-1");
        b7.setBounds(820,380,80,40);
        b7.setBackground(Color.white);
        JMenuBar mb=new JMenuBar();
              JMenu file=new JMenu("file");
        mb.add(file);
        
        file.setIcon(new ImageIcon("ficon.png"));
        JMenu exit=new JMenu("exit");
        file.add(exit);

        exit.setIcon(new ImageIcon("e.png"));
        exit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);

                }
            });
        l.add(jps);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(l);
        //l.add(t);
        f4.add(p);
        f4.add(p3);
        f4.setJMenuBar(mb);
        
        
    }

    public static void main()
    {
        new score();
    }

}