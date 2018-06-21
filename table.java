import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
import javax.swing.JScrollPane;
public class table 
{
    public table()
    {
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
        f3.setTitle("table");
        f3.setVisible(true);
        f3.setSize(900,900);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.add(p3);
        
    }

    public static void main(String[] args)
    {
       new table();

    }
}