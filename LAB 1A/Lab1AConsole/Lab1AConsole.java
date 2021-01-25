//NAME - Rutvik Marakana
import java.util.Scanner;
class Lab1AConsole
{
   public static void main(String [] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        System.out.println();
        System.out.println("The user's name is: "+name+"\nThe user's age is : "+age+" years");
    }
}