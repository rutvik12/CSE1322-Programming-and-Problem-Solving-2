import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;


class parallelBubbleSort extends RecursiveTask<Double>
{
  private final int [] arr;
  private int start;
  private int end;
  public static final long threshold=5000;
  
  public parallelBubbleSort(int[] arr)//Parameterized constructor
  {
     this(arr,0,arr.length);
  }
  private parallelBubbleSort(int[] arr,int start,int end)//Parameterized constructor
  {
     this.arr=arr;
     this.start=start;
     this.end=end;
  }
  //Override compute method
  protected Double compute()
  {
     int length=end-start;
     if(length<=threshold)
     {
       return sort();
     }
     parallelBubbleSort task1=new parallelBubbleSort(arr,start,start+length/2);//Creates an object of class parallelBubbleSort
     task1.fork();//Task in broken into sub-parts by using fork
     
     parallelBubbleSort task2=new parallelBubbleSort(arr,start+length/2,end);//Creates an object of class parallelBubbleSort
    
     Double task2Result=task2.compute();
     Double task1Result=task1.join();//Result of broken tasks is joined
     
     return task1Result+task2Result;
  }
  
  private double sort()
  {
     double startTime=System.currentTimeMillis();//Notes the current time and stores it in variable startTime
     //Bubble sorts the array
     for(int i=start;i<end-1;i++)
     {
       for(int j=i+1;j<end;j++)
       {
          if(arr[i]>arr[j])
          {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
          }
       }
    }
    double endTime=System.currentTimeMillis();//Notes the current time after process and stores it in variable endTime
    double time=endTime-startTime;//Calculates the time of the process
    
    return time;//Returns process time

  }
  public static double startParallelBubbleSort(int[] arr)
  {
        ForkJoinTask<Double> task = new parallelBubbleSort(arr); 
        return new ForkJoinPool().invoke(task);
  }
}
  

     
  
  