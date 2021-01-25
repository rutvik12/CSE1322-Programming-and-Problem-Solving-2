import java.util.Scanner;
class testPalindrome
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");//Asks the user to enter a String
        String s=sc.nextLine();//Stores the entered String in s
        System.out.println();
        
        PalindromeString ps=new PalindromeString();//Object ps of class PalindromeString
        boolean decision=ps.checkPalindromeString(s);
        
        if(decision==true)
        {
            System.out.println("String "+s+" is palindrome");
        }
        else 
        {
            System.out.println("String "+s+" is not palindrome");
        }
    }
}