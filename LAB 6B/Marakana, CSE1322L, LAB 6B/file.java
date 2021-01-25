import java.util.*;
import java.io.*;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.Scene;
import javafx.stage.Stage; 
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class file extends Application
{
    Label lbl=new Label("Text File Name");//Creates a label
    TextField tf=new TextField();//Creates a text field
    Button btLoad=new Button("Load File");//Creates a button
    TextArea tA=new TextArea();//Creates a text area
    Button btSave=new Button("Save File");//Creates a button
    
    public void start(Stage primaryStage)
    {
       GridPane gp=new GridPane();//Creates a grid pane
       gp.setHgap(10);//Sets a horizontal gap between different contents of the grid pane
       gp.setVgap(10);//Sets the vertical gap between different contents of the grid pane
       
       //Adds the label,vtext field, text area and the buttons to the grid pane 
       gp.add(lbl,0,0);
       gp.add(tf,1,0);
       gp.add(btLoad,0,1);
       gp.add(tA,0,2,2,2);
       gp.add(btSave,0,5);
       
       gp.setAlignment(Pos.CENTER);//Sets the alignment of the grid pane to the center 
       
       EventHandler<ActionEvent> e=new EventHandler<ActionEvent>()//Creating an Event handler
       {
          public void handle(ActionEvent e)//Method handle of the event handler
          {
              if(e.getSource().equals(btLoad))
              {
                 try
                 {
                 LoadFile();//Calls the method LoadFile
                 }
                 catch(FileNotFoundException f)
                 {
                    System.out.println("File not found");
                 }
              }
              if(e.getSource().equals(btSave))
              {
                 try
                 {
                 SaveFile();//Calls the method SaveFile 
                 }
                 catch(FileNotFoundException f)
                 {
                    System.out.println("File not found");
                 }
                 
              }
          }
       };
       //Sets action on buttons btLoad and btSave
       btLoad.setOnAction(e);
       btSave.setOnAction(e);
       
       Scene scene=new Scene(gp,600,300);//Sets the grid pane to the scene
       primaryStage.setTitle("File Append");//Sets the title of the stage
       primaryStage.setScene(scene);//Sets the scene to the stage
       primaryStage.show();//Shows the stage
    }

    public String getText()//Method returns the text in the text area
    {
       return tA.getText();
    }
    
    public void appendtext(String textAdd)//Appends the text 
    {
       String text=tA.getText();//gets the text from the text area to the String text
       if(!text.isEmpty())
       {
           text=text+"\n";
           text=text+textAdd;//Appends the String taken as parameter 
       }
       else
       {
          text=textAdd;
       }
       tA.setText(text);//Sets the text
    }
    
    public void SaveFile()throws FileNotFoundException
    {
       File f=new File(tf.getText());//Creates a file
       try
       {
       Scanner file=new Scanner(f);//Reads the file
       
       //Writes the content of the file
       PrintWriter pw=new PrintWriter(f);
       pw.print(getText()); 
       pw.close();//Closes the file
       }
       catch(FileNotFoundException e)
       {
          System.out.println("File not found");
       }
    }
    
    public void LoadFile()throws FileNotFoundException
    {
      File f=new File(tf.getText());//Creates a file
      if(!f.exists())
      {
         tA.setText("No such file exists");
      }
      else
      {
         try
         {
            Scanner file=new Scanner(f);//Reads the file
       
            while(file.hasNextLine())
            {
               String s=file.nextLine();
               tA.appendText(s+"\n");
            }
            file.close();//Closes the file
         }
         catch(FileNotFoundException e)
         {
            System.out.println("File not found");
         }
      }
    }
    
    public static void main(String [] args)
    {
       launch(args);
    }
}