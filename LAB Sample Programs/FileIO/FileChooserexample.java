import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.control.TextArea;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.PrintWriter;


public class FileChooserexample extends Application {

private Text actionStatus;
private Stage savedStage;
private TextArea txtArea;
private static final String titleTxt = "JavaFX File Chooser";
private static final String defaultFileName = "MyFile.txt";

public static void main(String [] args) {

Application.launch(args);
}

@Override
public void start(Stage primaryStage) {
primaryStage.setTitle(titleTxt);

// Window label
Label label = new Label("File Chooser");
label.setTextFill(Color.DARKBLUE);
label.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
HBox labelHb = new HBox();
labelHb.setAlignment(Pos.CENTER);
labelHb.getChildren().add(label);
  // Text area in a scrollpane and label
Label txtAreaLabel = new Label("File Text:");
txtAreaLabel.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
txtArea = new TextArea();
txtArea.setWrapText(true);
ScrollPane scroll = new ScrollPane();
scroll.setContent(txtArea);
scroll.setFitToWidth(true);
scroll.setFitToHeight(true);
scroll.setPrefHeight(150);
scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
VBox txtAreaVbox = new VBox(5);
txtAreaVbox.setPadding(new Insets(5, 5, 5, 5));
txtAreaVbox.getChildren().addAll(txtAreaLabel, scroll);
      
      // Buttons
Button btn1 = new Button("Choose a file...");
btn1.setOnAction(new SingleFcButtonListener());
HBox buttonHb1 = new HBox(10);
buttonHb1.setAlignment(Pos.CENTER);
buttonHb1.getChildren().addAll(btn1);
      

// Button
Button btn2 = new Button("Save as file...");
//btn2.setOnAction(new SaveButtonListener());
HBox buttonHb2 = new HBox(10);
buttonHb2.setAlignment(Pos.CENTER);
buttonHb2.getChildren().addAll(btn1);

// Status message text
actionStatus = new Text();
actionStatus.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
actionStatus.setFill(Color.FIREBRICK);

// Vbox
VBox vbox = new VBox(30);
vbox.setPadding(new Insets(25, 25, 25, 25));
vbox.getChildren().addAll(labelHb, txtAreaVbox, buttonHb1,buttonHb2, actionStatus);

// Scene
Scene scene = new Scene(vbox, 600, 400); // w x h
primaryStage.setScene(scene);
primaryStage.show();

savedStage = primaryStage;
}
    private class SingleFcButtonListener implements EventHandler<ActionEvent> {

@Override
public void handle(ActionEvent e) {

showSingleFileChooser();
}
}

public void showSingleFileChooser() {
FileChooser fileChooser = new FileChooser();
File selectedFile = fileChooser.showOpenDialog(null);

if (selectedFile != null) {

actionStatus.setText("File selected: " + selectedFile.getName());
}
else {
actionStatus.setText("File selection cancelled.");
}
      try {
      FileInputStream fis = new FileInputStream(selectedFile);
      char current;
      while (fis.available() > 0) {
        current = (char) fis.read();
        String s=Character.toString(current);
         txtArea.appendText(s);
       }
       }
      catch (IOException e) {
      e.printStackTrace();
    }
} 
}
    