import java.util.Arrays;
import java.util.Random;

class ArraySum
{
   public static void main(String [] args)
   {
       int[] array=new int[10000];
       Random rn=new Random();
       for(int i=0;i<10000;i++)//Storing random numbers in array
       {
          array[i]=rn.nextInt(100);
       }
       //Creating objects of class SumThread
       SumThread arraySum1=new SumThread(array,"Thread 1",0,2500);
       SumThread arraySum2=new SumThread(array,"Thread 2",2500,5000);
       SumThread arraySum3=new SumThread(array,"Thread 3",5000,7500);
       SumThread arraySum4=new SumThread(array,"Thread 4",7500,10000);
       //Creating threads of objects
       Thread t1=new Thread(arraySum1);
       Thread t2=new Thread(arraySum2);
       Thread t3=new Thread(arraySum3);
       Thread t4=new Thread(arraySum4);
       //Starting the threads
       t1.start();
       t2.start();
       t3.start();
       t4.start();
       //Checking whether all threads are alive
       while(t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive())
       {}
       //Printing the sum of individual threads
       System.out.println("\nSum of thread 1: "+arraySum1.getSum());
       System.out.println("Sum of thread 2: "+arraySum2.getSum());
       System.out.println("Sum of thread 3: "+arraySum3.getSum());
       System.out.println("Sum of thread 4: "+arraySum4.getSum());
       //Printing the sum of all threads
       System.out.print("Sum of all threads: "+(arraySum1.getSum()+arraySum2.getSum()+arraySum3.getSum()+arraySum4.getSum()));
   }
       
}

class SumThread implements Runnable
{
   int[] SumArray;
   String threadName;
   long sum=0;
   int start;
   int end;
   
   public SumThread(int[] SumArray,String threadName,int start,int end)//Parameterized constructor
   {
     this.SumArray=SumArray;
     this.threadName=threadName;
     this.start=start;
     this.end=end;
   }
   //Run method 
   public void run()
   {
      System.out.println("Thread "+threadName+" is running");
      
       for(int i=start;i<end;i++)
       {
         sum=sum+SumArray[i];
       }
    }
    
    public long getSum()//Method returns the sum
    {
      return sum;
    }
}
       