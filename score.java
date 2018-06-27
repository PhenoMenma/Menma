import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class score {
    

    public static void main() {
      JTextField t1=new JTextField("00");
      JTextField t2=new JTextField();
      JButton b=new JButton("+3");
      String s1=t1.getText();
      int a=Integer.parseInt(s1);
     
      JFrame jf=new JFrame();
      jf.setResizable(false);
      jf.setVisible(true);
      jf.setSize(900,900);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel jp=new JPanel();
      
      
       t1.setBorder(BorderFactory.createLineBorder(Color.black));
         //t2.setBorder(BorderFactory.createLineBorder(Color.black));
        BoxLayout bl1 = new BoxLayout(jp, BoxLayout.X_AXIS);
       jp.setLayout(bl1);
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String s1=t1.getText();
                    int a=Integer.parseInt(s1);
                    a=a+3;
                    t1.setText(""+a);
                    

                }
            });
      // jp.setLayout(new BorderLayout());
         t1.setBounds(10,300,90,30);
         b.setBounds(10,10,10,10);
         jp.add(t1);
         jp.add(b);
       jf.add(jp);
       jf.setVisible(true);
   
    }
}