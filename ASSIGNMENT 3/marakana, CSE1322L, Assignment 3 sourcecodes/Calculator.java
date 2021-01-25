import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.stage.Stage; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;

public class Calculator extends Application 
{
      private TextField tf1=new TextField("");
      private Button bt0=new Button("0");
      private Button bt1=new Button("1");
      private Button bt2=new Button("2");
      private Button bt3=new Button("3");
      private Button bt4=new Button("/");
      private Button bt5=new Button("4");
      private Button bt6=new Button("5");
      private Button bt7=new Button("6");
      private Button bt8=new Button("*");
      private Button bt9=new Button("7");
      private Button bt10=new Button("8");
      private Button bt11=new Button("9");
      private Button bt12=new Button("+");
      private Button bt13=new Button("-");
      private Button bt14=new Button("=");
      private Button bt15=new Button("C");
      private int num1=0,num2=0;
      private String n1="",n2="",n3="";
      private String op="";
      
     


   public void start(Stage primaryStage)
   {
      
      GridPane Gpane=new GridPane();
      Gpane.setHgap(10);
      Gpane.setVgap(10);
      Gpane.setAlignment(Pos.CENTER);
      Gpane.add(tf1,0,0,4,1);
      
      Gpane.add(bt0,0,5);
      Gpane.add(bt1,0,2);
      Gpane.add(bt2,1,2);
      Gpane.add(bt3,2,2);
      Gpane.add(bt4,3,2);
      Gpane.add(bt8,3,3);
      
      Gpane.add(bt5,0,3);
      Gpane.add(bt6,1,3);
      Gpane.add(bt7,2,3);
      Gpane.add(bt12,3,4);
      Gpane.add(bt13,3,5);
      
      Gpane.add(bt9,0,4);
      Gpane.add(bt10,1,4);
      Gpane.add(bt11,2,4);
      Gpane.add(bt14,2,5);
      Gpane.add(bt15,1,5);
  
     Scene scene=new Scene(Gpane,250,250);
      
      
     EventHandler<ActionEvent> e=new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e)
        {   
           if(e.getSource().equals(bt0))
           {
              n1=tf1.getText()+"0";
              tf1.setText(n1);        
           }
           else if(e.getSource().equals(bt1))
           {
              n1=tf1.getText()+"1";
              tf1.setText(n1);
           }
           else if(e.getSource().equals(bt2))
           {
              n1=tf1.getText()+"2";
              tf1.setText(n1);
              
           }
           else if(e.getSource().equals(bt3))
           {
              n1=tf1.getText()+"3";
              tf1.setText(n1);
              
           }
           else if(e.getSource().equals(bt5))
           {
              n1=tf1.getText()+"4";
              tf1.setText(n1);
              
           }
           else if(e.getSource().equals(bt6))
           {
              n1=tf1.getText()+"5";
              tf1.setText(n1);
              
           }
           else if(e.getSource().equals(bt7))
           {
              n1=tf1.getText()+"6";
              tf1.setText(n1);
              
           }
           else if(e.getSource().equals(bt9))
           {
              n1=tf1.getText()+"7";
              tf1.setText(n1);
              
           }
           else if(e.getSource().equals(bt10))
           {
              n1=tf1.getText()+"8";
              tf1.setText(n1);
              
           }
           else if(e.getSource().equals(bt11))
           {
              n1=tf1.getText()+"9";
              tf1.setText(n1);
              
           }
           else if(e.getSource().equals(bt15))
           {
              n1="";
              tf1.setText(n1);
           }
           //operators
           else if(e.getSource().equals(bt4))
           {
               n2=tf1.getText();
               num1=Integer.parseInt(n2);
               tf1.setText("");
               op="/";
               
           }
           else if(e.getSource().equals(bt8))
           {
               n2=tf1.getText();
               num1=Integer.parseInt(n2);
               tf1.setText("");
               op="*";
               
           }
           else if(e.getSource().equals(bt12))
           {
               n2=tf1.getText();
               num1=Integer.parseInt(n2);
               tf1.setText("");
               op="+";
              
               
           }
           else if(e.getSource().equals(bt13))
           {
               n2=tf1.getText();
               num1=Integer.parseInt(n2);
               tf1.setText("");
               op="-";
               
           }
           //num2 functions
           if(e.getSource().equals(bt14)) 
           {   
               
               n3=tf1.getText();
               num2=Integer.parseInt(n3);
               if(op=="/")
               {
                  int answer=num1/num2;
                  tf1.setText(""+num1+"/"+num2+"="+answer);
               }
               else if(op=="*")
               {
                  int answer=num1*num2;
                  tf1.setText(""+num1+"*"+num2+"="+answer);
               }
               else if(op=="+")
               {
                  int answer=num1+num2;
                  tf1.setText(""+num1+"+"+num2+"="+answer);
               }
               else if(op=="-")
               {
                  int answer=num1-num2;
                  tf1.setText(""+num1+"-"+num2+"="+answer);
               }           
           }

         }};
         bt0.setOnAction(e);
         bt1.setOnAction(e);
         bt2.setOnAction(e);
         bt3.setOnAction(e);
         bt5.setOnAction(e);
         bt6.setOnAction(e);
         bt7.setOnAction(e);
         bt9.setOnAction(e);
         bt10.setOnAction(e);
         bt11.setOnAction(e);
         bt4.setOnAction(e);
         bt8.setOnAction(e);
         bt12.setOnAction(e);
         bt13.setOnAction(e);
         bt14.setOnAction(e);
         bt15.setOnAction(e);
               
      primaryStage.setTitle("Calculator");
      primaryStage.setScene(scene);
      primaryStage.show();
  }
  public static void main(String [] args)
  {
     launch(args); 
  } 
} 

   
    



     
         
      
      
      
      
      

      
      