class Staff extends Employee//Class Staff inherits class Employee
{
   //Declaring variables
   String title;
   
   public Staff(String name,String address,String phoneNumber,String emailAddress,String office,String salary,MyDate hireDate,String title)//Parameterized constructor
   {
      super(name,address,phoneNumber,emailAddress,office,salary,hireDate);//Refers to the super class Person
      this.title=title;
   }
   public String toString()
    {
        String a="Class name: Staff\nName: "+this.name+"\nAddress: "+this.address+"\nPhone Number: "+this.phoneNumber+"\nEmail Address: "+this.emailAddress+"\nOffice: "+this.office+"\nSalary: "+this.salary+"\nDate Hired: "+this.hireDate+"\nTitle: "+this.title;
        return a;
    }
}
