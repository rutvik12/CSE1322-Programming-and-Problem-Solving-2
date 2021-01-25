import java.util.Scanner;
import java.util.ArrayList;
class SumElements
{
    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer> list=new ArrayList<>();//Declaring an ArrayList which will store Integer values
       int counter=0;
       char decision='y';
            
       while(counter<11 && decision == 'y')
       {
            System.out.print("Enter an Integer: ");//Takes user input
            int a=sc.nextInt();//Stores the user input
            list.add(a);//Adds the user input in the ArrayList
            System.out.print("Do you want to enter another integer(y/n): ");//Asks the user to make a decision
            decision=sc.next().charAt(0);//Stores the decision of user
            decision = Character.toLowerCase(decision);//Converts the stored value to lower case
            counter++;//Increments the counter
       }

        System.out.println();
        //Printing the elements of the ArrayList
        System.out.print("Elemets of the ArrayList list: ");
        for(int i=0;i<list.size()-1;i++)
        {
           System.out.print(list.get(i)+", ");
        }
        System.out.print(list.get(list.size()-1));
        System.out.println();
        //Printing the sum of all elements of the ArrayList
        int sum=addElements(list);
        System.out.println("The sum of all elements of the ArrayList list: "+sum);
    }
    
    //Method adds the elements of the ArrayList
    public static int addElements(ArrayList<Integer> arr)
    {
       int sum=0;
       for(int i=0;i<arr.size();i++)
       {
           sum+=arr.get(i);
       }
       return sum;
    }
}