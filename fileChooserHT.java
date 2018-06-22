import javax.swing.JButton;
import javax.swing.JFileChooser;
public class fileChooserHT
{
  public static void main()
  {
      JButton open =new JButton();
      JFileChooser f=new JFileChooser();
      f.setCurrentDirectory(new java.io.File("Desktop/hvslen"));
      f.setDialogTitle("hello");
      f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      if(f.showOpenDialog(open)==JFileChooser.APPROVE_OPTION)
      {
        
        }
        
    }

}