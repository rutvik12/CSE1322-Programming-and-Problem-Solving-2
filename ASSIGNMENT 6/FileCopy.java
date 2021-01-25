import java.io.*;
import java.util.*;

class FileCopy
{
   public static void main(String [] args) throws FileNotFoundException
   {
      
          Scanner sc=new Scanner(System.in);//Reads user input
          System.out.print("Enter the file name: ");//Asks the user to enter a file name
          String fileName=sc.nextLine();//Stores the file name as String
          
          File f=new File(fileName);//Creates a file with the user input file name
          
          while(!f.exists())
          {
             System.out.println("Do you want to abort the program or enter a new file name (Enter Y to abort or enter N to type a new file name)");
             String c1=sc.nextLine();//Asks the user to decide whether to abort or enter a new file and stores the decision as String
             if(c1.equals("N"))
             {
                System.out.print("Enter the new file name: ");
                fileName=sc.nextLine();
                f=new File(fileName);//Creates a file with new file name
             }
             else
             {
                System.exit(0);//Exits the program
             }
          }
          
          System.out.print("Enter the file name to which you want to copy the existing file: ");//Asks the user to enter the file name to which the content needs to be copied
          String newFile=sc.nextLine();//Stores the file name as String
          
          File f1=new File(newFile);//Creates a new file 
          
          while(f1.exists())
          {
             System.out.print("File already exists. Do you want to override (Enter Y to override)");
             String c2=sc.nextLine();
             
             if(c2.equals("Y"))
             {
                break;
             }
             else
             {
                System.out.print("Enter a file name");
                newFile=sc.nextLine();
                f1=new File(newFile);//Creates a file with the new name
             }
         }
         
         String contents="";
         Scanner file=new Scanner(f);//Reads the contents of the file
         while(file.hasNextLine())
         {
            contents=contents+file.nextLine()+"\n";//Stores the contents of the file
         }
         PrintWriter pw=new PrintWriter(f1);//Creates a printwriter with the new file
         System.out.println("The existing file is: "+f+" and the file to which the contents of existing file are copied is: "+f1); 
         pw.print(contents);//Prints the contents from the existing file to new file
         pw.close();//Closes the file
     }
}    