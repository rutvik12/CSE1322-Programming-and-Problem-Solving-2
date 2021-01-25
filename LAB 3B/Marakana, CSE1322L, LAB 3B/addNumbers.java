import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.stage.Stage; 
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class addNumbers extends Application
{
      
   public void start(Stage primaryStage)
   {
      TextField textField1=new TextField();//Creating text field
      TextField textField2=new TextField();//Creating text field
      Button add=new Button("Add");//Creating button
      Label lbl=new Label("");//Creating label

      GridPane gp=new GridPane();//Creating grid pane
      gp.setHgap(10);//Setting horizontal gap of grid pane
      gp.setVgap(10);//Setting vertical gap of grid pane
      
      //Adding textfields, button and label to grid pane at specific location
      gp.add(textField1,0,0);
      gp.add(textField2,0,1);
      gp.add(add,0,2);
      gp.add(lbl,0,3);
      
      gp.setAlignment(Pos.CENTER);//Aligning the contents of grid pane
      
      EventHandler<ActionEvent> e=new EventHandler<ActionEvent>()//Creating an EventHandler
      {
         public void handle(ActionEvent e)
         {   
             double number1=Double.parseDouble(textField1.getText());
             double number2=Double.parseDouble(textField2.getText());
             double answer=number1+number2;
             lbl.setText(""+number1+"+"+number2+"="+answer);//Setting the label with the given content in brackets
         }
     };
      add.setOnAction(e);
      Scene scene=new Scene(gp,200,200);//Creating a scene and adding gridpane to it
      primaryStage.setTitle("Add Numbers");//Setting the title of stage
      primaryStage.setScene(scene);//Setting the scene to stage
      primaryStage.show();//Showing the stage
   }
   public static void main(String [] args)
   {
      launch(args);//launching all arguments
   }
} 