class Tests
{
   //Declaring certain private variables
   private String firstName,lastName;
   private double test1,test2,test3,test4,test5;
   private double avg;
   private char grade;
   double[] array=new double[5];
   
   public Tests(String firstName,String lastName,double test1,double test2,double test3,double test4,double test5)//Parameterized constructor
   {
       this.firstName=firstName;
       this.lastName=lastName;
       this.test1=test1;
       this.test2=test2;
       this.test3=test3;
       this.test4=test4;
       this.test5=test5;
       
   }
   
   public void setTestGrades(double test1, double test2, double test3, double test4, double test5)//Set method for the test scores
   {
       this.array[0]=this.test1;
       this.array[1]=this.test2;
       this.array[2]=this.test3;
       this.array[3]=this.test4;
       this.array[4]=this.test5;
   }
   
   public double[] getGrades()//Get method for the test scores
   {
      return array;
   }

   public double average(double[] arr)//average method 
   {
      avg=(arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/5.0;//Stores the average of all scores in variable avg
      return avg;
   }
   
   public char grades(double avg)//grades method 
   {
      //Finds the associated grade bassed on average of all tests and stores the grade in variable grade
      if(avg>0 && avg<60)
      {
         this.grade='F';
      }
      else if(avg>=60 && avg<70)
      {
         this.grade='D';
      }
      else if(avg>=70 && avg<80)
      {
         this.grade='C';
      }
      else if(avg>=80 && avg<90)
      {
         this.grade='B';
      }
      else
      {
         this.grade='A';
      }
      return this.grade;//Returns the calculated grade
   }
   
   public String toString()//toString method
   {
      String data=this.firstName+"         "+this.lastName+"   "+this.test1+"    "+this.test2+"    "+this.test3+"    "+this.test4+"    "+this.test5+"     "+this.avg+"       "+this.grade;
      return data;//Returnsthe string called data
   }
}