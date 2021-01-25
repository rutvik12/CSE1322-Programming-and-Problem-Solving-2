import java.util.*;
class TimeException
{
  public static void main(String [] args)
  {
     String decision="";
     while(!decision.equals("NO"))
     { 
        Scanner sc=new Scanner(System.in);//Takes user input
        System.out.print("Enter a time in 24hr format (hh:mm)- ");
        String time=sc.nextLine();//Stores the user input

    try
    {
      if(time.length()<5 || time.length()>5)
      {
         throw new TimeFormatException("Invalid Input.Try again");//Throws an exception
      }
      if(time.indexOf(":")!=2)
      {
         throw new TimeFormatException("Invalid format of input.Try again");//Throws an exception
      }
      int hr=Integer.parseInt(time.substring(0,2));//Converts a substring to integer
      int min=Integer.parseInt(time.substring(3,5));//Converts a substring to integer
      
      if(hr<0 || hr>24)
      {
      
         throw new TimeFormatException("Invalid hour. Try again");//Throws an exception
      }
      
      if(min<0 || min>=60)
      {
         throw new TimeFormatException("Invalid minutes. Try again");//Throws an exception
      }
      
      boolean AM=true;
      
      if(hr<12)
      {
         AM=true;
      }
      else if(hr==12)
      {
         AM=false;
      }
      else
      {
         AM=false;
         hr=hr-12;
      }
      String minutes="";
      if(min==0)
      {
         minutes="00";
      }
      else
      {
         minutes=""+min;
      }
      String hour="";
      if(hr==0)
      {
          hour="12";
      }
      else
      {
          hour=""+hr;
      }
      System.out.print("12 hour format- "+hour+":"+minutes);
      if(AM==true)
      {
          System.out.println(" AM");
          
      }
      else
      {
          System.out.println(" PM");
      }
   }
      catch(TimeFormatException e)//Catches the thrown exception
      {
          System.out.println(e);//Prints the message related to each exception
      }
      Scanner sc1=new Scanner(System.in);
      System.out.print("Do you want to convert another time (Enter NO if you dont want to, else enter any key)");//Asks the user if another time needs to be converted
      decision=sc.nextLine();
      System.out.println();
  }
 }
}
class TimeFormatException extends Exception
{
    String str1="";
    
    public TimeFormatException(String str2)//Parameterized constructor
    {
       str1=str2;
    }
    public String toString()//toString method
    {
       return "Time format Exception: "+str1;
    }
}
