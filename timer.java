import javax.swing.*;
import java.awt.*;
import java.util.*;
public class timer
{ public static void main(String[] args)
    {
        timer t=new timer();
    }

    public timer()
    {
        JFrame f=new JFrame("timer");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Date d=new Date();
        SpinnerDateModel s=new SpinnerDateModel(d,null,null,Calendar.HOUR_OF_DAY);
        JSpinner spinner=new JSpinner(s);
        JSpinner.DateEditor de=new JSpinner.DateEditor(spinner,"HH:mm:ss");
        spinner.setEditor(de);
        f.add(spinner,BorderLayout.NORTH);
        f.setSize(100,100);
        f.setVisible(true);

    }
}