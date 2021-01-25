import java.util.Random;
import java.text.DecimalFormat;
import java.util.Arrays;
class Main
{
   public static void main(String [] args)
   {
      //Creates two arrays
      int [] arr1=new int[10000];
      int [] arr2=new int[10000];
      Random rn=new Random();
      //Assigns the same random values to the array
      for(int i=0;i<arr1.length;i++)
      {
         arr1[i]=rn.nextInt(100);
      }
      arr2=Arrays.copyOf(arr1,arr1.length);
      //Creates object of class sequentialBubbleSort
      sequentialBubbleSort s1=new sequentialBubbleSort(arr1);
      s1.sort();
      System.out.println();
      //Creates object of class parallelBubbleSort
      parallelBubbleSort p1=new parallelBubbleSort(arr2);
      double time=p1.startParallelBubbleSort(arr2);
      
      DecimalFormat df=new DecimalFormat(".#####");
      double mintime=time/60000;
      System.out.println("The time it took for parallel Bubble Sort is "+df.format(time)+" milliseconds or "+df.format(mintime)+" minutes");
      
   }
}
     