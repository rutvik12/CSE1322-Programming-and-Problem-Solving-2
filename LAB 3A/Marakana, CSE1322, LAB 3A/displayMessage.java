import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

 public class displayMessage extends Application {
 @Override 
 public void start(Stage primaryStage) 
 {
     Button bt1 = new Button("Button 1");
     Button bt2 = new Button("Button 2");
     Button bt3 = new Button("Button 3");
     Button bt4 = new Button("Button 4");
     Button bt5 = new Button("Button 5");
     Button bt6 = new Button("Button 6");
  
     FlowPane Fpane=new FlowPane();
     
     Fpane.getChildren().add(bt1);
     Fpane.getChildren().add(bt2);
     Fpane.getChildren().add(bt3);
     Fpane.getChildren().add(bt4);
     Fpane.getChildren().add(bt5);
     Fpane.getChildren().add(bt6);
     
     Fpane.setHgap(20);
     Fpane.setVgap(10);
     
     Scene scene = new Scene(Fpane, 200, 100);
     
     
     bt1.setOnAction(e->
        System.out.println("Button 1 was clicked")
     );
     
     bt2.setOnAction(e-> 
        System.out.println("Button 2 was clicked")
     );
     
     bt3.setOnAction(e->
        System.out.println("Button 3 was clicked")
     );
     
     bt4.setOnAction(e->
        System.out.println("Button 4 was clicked")
     );
     
     bt5.setOnAction(e->
        System.out.println("Button 5 was clicked")
     );
     
     bt6.setOnAction(e->
        System.out.println("Button 6 was clicked")
     );
     primaryStage.setTitle("ButtonClickDisplay"); 
     primaryStage.setScene(scene); 
     primaryStage.show(); 
 }
 public static void main(String [] args)
 {
    launch(args);
 }
}