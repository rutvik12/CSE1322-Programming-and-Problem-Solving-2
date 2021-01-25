import java.text.DecimalFormat;
class sequentialBubbleSort
{
  int[] arr;
  
  public sequentialBubbleSort(int[] arr)//Parameterized constructor
  {
     this.arr=arr;
  }
  //Method sorts the array
  public void sort()
  {
    //Notes the current time and stores in a variable start
    double start=System.currentTimeMillis();
    //Sorts the array using traditional bubble sort 
    for(int i=0;i<arr.length-1;i++)
    {
       for(int j=i+1;j<arr.length;j++)
       {
          if(arr[i]>arr[j])
          {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
          }
       }
    }
    //Notes the current time and stores in variable end
    double end=System.currentTimeMillis();
    //Calculates the total time of process in milliseconds
    double time=end-start;
    //Calculates the time in minutes
    double timeMin=time/60000;
    DecimalFormat df=new DecimalFormat(".#####");
    System.out.println("The time it took for sequential bubble sort is "+df.format(time)+ " milliseconds"+" or "+df.format(timeMin)+" minutes");//Displays the time of process 
  }
}
