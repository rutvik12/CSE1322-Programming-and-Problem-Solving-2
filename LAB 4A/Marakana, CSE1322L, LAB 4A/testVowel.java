import java.util.Scanner;
class testVowel
{
   public static void main(String [] args)
   {
       vowels V1=new vowels();//Object V1 of class vowels
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a String to check for number of vowels: ");
       String s=sc.nextLine();
       int total= V1.Vowel(s);//Stores the numbers of vowels in variable total
       System.out.println();
       System.out.println("The number of vowels in String "+s+": "+total);
   }
}