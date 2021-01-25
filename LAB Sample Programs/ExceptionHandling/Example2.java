import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
class Example2
{
   public static void main(String[] args)
   {
       //Input date in String format
       String input = "12:10";
       //Date/time pattern of input date
       SimpleDateFormat df = new SimpleDateFormat("HH:mm");
       //Date/time pattern of desired output date
       SimpleDateFormat outputformat = new SimpleDateFormat("hh:mm aa");
       Date date = null;
       String output = null;
       try{
          //Conversion of input String to date
      date= df.parse(input);
          //old date format to new date format
      output = outputformat.format(date);
      System.out.println(output);
    }catch(ParseException pe){
        pe.printStackTrace();
    }
   }
}
