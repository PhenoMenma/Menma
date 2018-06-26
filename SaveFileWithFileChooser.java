 
 import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
 
 
public class SaveFileWithFileChooser extends Application {
 
    @Override
    public void start(final Stage primaryStage) {
        final String sampleText ="xcfxvf";
 
        Text sample = new Text(sampleText);
       sample.setFont(new Font(14));
 
        Button btnSave = new Button("Save");
        Button btnOpen = new Button("Open");
        
          btnOpen.setOnAction(event ->{
          FileChooser fileChooser2 = new FileChooser();
        

	File openFile = fileChooser2.showOpenDialog(primaryStage);

	 

	if (openFile != null) {
                saveTextToFile(sampleText, openFile);
            }

	
        });
        btnSave.setOnAction(event ->{
            FileChooser fileChooser  = new FileChooser();
 
            
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
            fileChooser.getExtensionFilters().add(extFilter);
 
           
            File file = fileChooser.showSaveDialog(primaryStage);
 
            if (file != null) {
                saveTextToFile(sampleText, file);
            }
       });
 
        VBox vBox = new VBox(sample, btnSave,btnOpen);
        vBox.setAlignment(Pos.CENTER);
 
        primaryStage.setScene(new Scene(vBox, 800, 300));
        primaryStage.setTitle("save");
        primaryStage.show();
 
    }
 
    private void saveTextToFile(String content, File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.println(content);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(SaveFileWithFileChooser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}