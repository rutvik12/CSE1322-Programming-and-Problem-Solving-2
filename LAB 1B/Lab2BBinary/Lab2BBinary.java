//NAME - RUTVIK
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
class Lab2BBinary
{
   public static void main(String [] args)
   {  
      Scanner sc=new Scanner(System.in);//Takes user input 
      System.out.print("Enter the key element to search for in the array: ");//Asks the user to enter a key element they want to search for
      int key=sc.nextInt();//Stores the value fo element in variable key
      System.out.println();
      
      int[] nums={1,4,4,22,-5,10,21,-47,23};
      int a=binarySearch(nums,key);//Calls and stores the return valeu fo method binarySearch in variable a
      System.out.print("Array "+"nums :");
      for(int i=0;i<nums.length;i++)
      {
         System.out.print(" "+nums[i]);//Prints the elements of array nums
      }
      System.out.println();
      System.out.println("Value "+key+" is found at index "+a+" in the array nums");
      
      int[] data=new int[20];
      data=randomNumbers(data);//Calls and stores the return value of method randomNumbers in variable data
      int b=binarySearch(data,key);//Calls and stores the return value of method binarySearch in variable data
      System.out.print("Array "+"data :");
      for(int i=0;i<data.length;i++)
      {
          System.out.print(" "+data[i]);//Prints the elements of array data
      }
      System.out.println();
      System.out.println("Value "+key+" is found at index "+b+" in the array data");
   }
   
   public static int binarySearch(int[] array,int key)
   {  
      int index=-100;
      Arrays.sort(array);//Sorts the array
      int high=array.length,low=0;
      int mid=(high+low)/2; 
      int mid1=array[mid];
      while(low<=high)
      {  
         if(key<mid1)
         {
            high=mid-1;
            mid=(high+low)/2;
            mid1=array[mid];
         }
         else if(key>array[mid])
         {
            low=mid+1;
            mid=(high+low)/2;
            mid1=array[mid];
         }
         else
         {
            index=mid;
            break;
         }
     }
      
     if(index==-100)
      {  
         if(key==array[array.length-1])
         {
            index=array.length-1;
         }
         else
         {
             for(int i=0;i<array.length;i++)
             {
                if(key<array[i])
                {
                   index=-((i+1));
                   break;
                }
             }
         }
      }

      return index;//Returns the index of the element
                 
   }
   
   public static int[] randomNumbers(int[] array)
   {
      Random rn=new Random();
       
      for(int i=0;i<array.length;i++)
      {
         array[i]=rn.nextInt(201)-100;//Assigns random numbers between -100 and 100 and stores them at index i in the array
      }
      return array;
   }
} 
   
