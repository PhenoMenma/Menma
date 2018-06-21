import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
public class table extends JPanel
{
    JTable jt;
    public table()
    {
        String[] columns={"     Player     ","P","PTS","REB","AST","STL","BLK","FG%","3P%","FT%","TOV"};
        String[][] data={{"                ","","","","","","","","","",""},
                         {"                ","","","","","","","","","",""},
                         {"                ","","","","","","","","","",""},
                         {"                ","","","","","","","","","",""},
                         {"                ","","","","","","","","","",""},};
        jt=new JTable(data,columns);
        jt.setPreferredScrollableViewportSize(new Dimension(900,63));
        jt.setFillsViewportHeight(true);
        JScrollPane jps=new JScrollPane(jt);
        add(jps);
        
    }

    public static void main(String[] args)
    {JFrame f=new JFrame("huslengiih");
       table t=new table();
       f.setTitle("table");
        f.setResizable(false);
        f.setVisible(true);
        f.setSize(900,900);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(t);
    }
}