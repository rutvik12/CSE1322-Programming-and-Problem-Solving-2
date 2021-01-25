class MyDate
{
    //Declaring variables
    int year,month,day;
    
    public MyDate(int month,int day,int year)//Parameterized constructor
    {
       this.day=day;
       this.month=month;
       this.year=year;
    }
    public String toString()
    {
      String date=this.month+"/"+this.day+"/"+this.year;
      return date;
    }
}

