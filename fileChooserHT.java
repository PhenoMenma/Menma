import java.io.File;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class fileChooserHT
{
   
  public static void main()
  {
     
      JButton open =new JButton();
      JFileChooser f4=new JFileChooser();
      f4.setCurrentDirectory(new File("Desktop/hvslen"));
      f4.setDialogTitle("hello");
      f4.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      
      if(f4.showOpenDialog(open)==JFileChooser.APPROVE_OPTION)
      {
         
            }
        
        }
        
    }

