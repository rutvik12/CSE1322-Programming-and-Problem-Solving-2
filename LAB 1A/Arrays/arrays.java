//NAME - RUTVIK
import java.util.Random;
class arrays
{
    public static void main(String [] args)
    {
       int[] nums={1,4,13,43,-25,17,22,-37,29};
       int largestValue1=findLargest(nums);//Stores the return value of method findLargest in varaible largestValue1
       System.out.println("The largest number in the array called nums is: "+largestValue1);
       
       int[] data=new int[20];//Declaring an array data of size 20
       data=randomNumbers(data);//Storing the return value of method randomNumbers in array data
       int largestValue2=findLargest(data);//Stores the return value of method findLargest in variable largestValue2
       System.out.println("The largest number in the array called data is: "+largestValue2);
       
       int sum=largestValue1+largestValue2;
       System.out.println("The sum of the largest values of arrays nums and data is: "+sum);
       System.out.println();
       
       System.out.print("Data Array: ");
       for(int i=0;i<20;i++)
       {
          System.out.print(data[i]+" ");//Prints the elements of the array data
       }
       System.out.println();
       int counter=0;
       int longest=0;
       
       for(int i=0;i<20;i++)
       {
          if(data[i]>0)
          {
             counter++;
             if(counter>longest)
             {
                longest=counter;
             }
          }
          else
          {
             counter=0;
          }
       }
       System.out.println("Length of the longest continuous series of positive number in the array data is: "+longest);
   }
   
   public static int findLargest(int[] array)//Method finds and returns the largest value in the array
   {
      int largest=0;
      for(int i=0;i<array.length;i++)
      {
         if(array[i]>largest)
         {
           largest=array[i];
         }
      }
      return largest;
   }
   
   public static int[] randomNumbers(int[] array)//Method stores random numbers in the array and then returns the array
   {
      Random rn=new Random();
      
      for(int i=0;i<array.length;i++)
      {
          array[i]=rn.nextInt(201)-100;
      }
      return array;
   }
}
      
   
       