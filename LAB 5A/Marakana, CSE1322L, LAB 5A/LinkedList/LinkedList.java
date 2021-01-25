import java.util.Scanner;
public class LinkedList
{
       private Node first;//Declares the head Node
       
       class Node
       {
          //Declares an Integer and a Node
          public int num;
          public Node next;
       }
       //Constructor
       public LinkedList()
       {
          first=null;
       }
       //Method adds the elements of the LinkedList
       public int AddElements()
       {
          int sum=0;
          
          for(Node temp = first;temp!=null;temp = temp.next)
          {
             sum=sum+temp.num;
          }
          return sum;
       }
       //Method adds the Node
       public void NodeAddition(int n)
       {
          Node newNode=new Node();
          newNode.num=n;
          newNode.next=first;
          first=newNode;
       }
       //Method returns the element at specified index
       public int getElement(int n)
       {
          Node curr=first;
          int index=0;
          int num=0;
          while(curr!=null)
          {
             if(index==n)
             {
               num=curr.num;
               break;
             }
             curr=curr.next;
             index++;
          }
          return num;
       } 
}
//Main class
class Main
{
       //Main method
       public static void main(String [] args)
       {
            LinkedList list=new LinkedList();//Creating an object of class LinkedList
            Scanner sc=new Scanner(System.in);//Takes user input
            int counter=0;
            char decision='y';
            
            while(counter<11 && decision == 'y')
            {
                System.out.print("Enter an Integer: ");//Asks the user to enter an Integer
                int a=sc.nextInt();//Stores the integer
                System.out.print("Do you want to enter another integer(y/n): ");//Asks the user to make a decision
                decision=sc.next().charAt(0);//Stores the decision 
                decision = Character.toLowerCase(decision);//Change the value of decision to lower case
                list.NodeAddition(a);//Calls method NodeAddition
                counter++;//Increments the counter
            }
            System.out.println();
            //prints the elements of LinkedList
            System.out.print("Elements of the LinkedList list: ");
            for(int i=0;i<9;i++)
            {
               System.out.print(list.getElement(i)+", ");
            }
            System.out.println(list.getElement(9));
            //Prints the sum of all Elements of LinkedList
            System.out.println("The sum of the elements of the LinkedList list: "+list.AddElements());
            
       }
}