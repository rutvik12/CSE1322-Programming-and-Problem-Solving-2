//NAME - RUTVIK
import java.util.Random;
import java.util.Scanner;
class Lab2ALinear
{
   public static void main(String [] args)
   {  
      Scanner sc=new Scanner(System.in);//Takes user input
      System.out.print("Enter the key element to search for in the array: ");//Ask the user to enter the key element to search for in the array
      int key=sc.nextInt();//Stores the entered element in variable key
      System.out.println();
      
      int[] nums={1,4,4,22,-5,10,21,-47,23};//Declares an integer array nums 
      int value1=linearSearch(nums,key);//Calls method linearSearch and stores the return value of this method in variable value1
      System.out.print("Array nums:- ");
      for(int i=0;i<nums.length;i++)
      {
          System.out.print(" "+nums[i]);
      }
      System.out.println();
      if(value1!=-1)//Prints a statement based on the value of varaible value1
      {
         System.out.println("Value "+key+" is found at index "+value1+" in the array nums");
      }
      else
      {
         System.out.println("Value "+key+" is not found in the array nums");
      }
      
      int[] data=new int[20];//Creates an array called data of size 20
      data=randomNumbers(data);//Calls method randomNumbers and stores the return value in array data
      int value2=linearSearch(data,key);//Calls method linearSearch and stores the return value in varaible value2
      System.out.print("Array data:- ");
      for(int i=0;i<data.length;i++)
      {
         System.out.print(" "+data[i]);
      }
      System.out.println();
      if(value2!=-1)//Prints a statement based on the value of variable value2
      {
         System.out.println("Value "+key+" is found at index "+value2+" in the array data");
      }
      else
      {
         System.out.println("Value "+key+" is not found in the array data");
      }
      
   }
   
   public static int linearSearch(int[] array,int key)//Method linearSearch
   {
      int index=0;
      
      for(int i=0;i<array.length;i++)
      {
         if(array[i]==key)//Stores a value in based on the satisfaction of the condition
         {
            index=i;
            break;
         }
         else
         {
            index=-1;
         }
      }
      return index;//Returns the value of index
   }
   
   public static int[] randomNumbers(int[] array)
   {
      Random rn=new Random();
      
      for(int i=0;i<array.length;i++)
      {
         array[i]=rn.nextInt(201)-100;//Sotres random numbers between -100 and 100 in the array
      }
      return array;//Returns the array
   }
}
      
      
      
      
      
      