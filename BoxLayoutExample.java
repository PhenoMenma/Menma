import java.awt.*;
import javax.swing.*;

public class BoxLayoutExample {

    public static void main(String[] arguments) {

        // main window
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame jf = new JFrame("BoxLayout Example");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(1, 1));
        jf.setSize(250,250); 
        jf.setResizable(false);

        // first panel BoxLayout vertical
        JPanel p1 = new JPanel();
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        BoxLayout bl1 = new BoxLayout(p1, BoxLayout.Y_AXIS);
        p1.setLayout(bl1);

        // add three buttons to first panel
        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B2");
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        // second panel BoxLayout horizontal
        JPanel p2 = new JPanel();
        p2.setBorder(BorderFactory.createLineBorder(Color.black));
        BoxLayout bl2 = new BoxLayout(p2, BoxLayout.Y_AXIS);
        p2.setLayout(bl2);

        // add three buttons to second panel
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B5");
        JButton b6 = new JButton("B6");
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);

        // add both panels to the window
        jf.add(p1);
        jf.add(p2);
        jf.setVisible(true);
    }
}