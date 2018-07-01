import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
import javax.swing.JScrollPane;
public class score
{
    static Thread thread=new Thread();
    public static void main (String[] args) throws InterruptedException
    {

        int minut,second,tethets;
       
        minut=1;
        
        second=1;
        tethets=99;
        while(true){
            Thread.sleep(10);
            tethets=tethets-1;
            if(tethets<1){
                tethets=99;
                second=second-1;
                if(second<1)
                {
                    second=59;
                    minut=minut-1;
                   
                   

                }
            }
            System.out.println("time:"+minut+":"+second+":"+tethets);


        }
    }

}
