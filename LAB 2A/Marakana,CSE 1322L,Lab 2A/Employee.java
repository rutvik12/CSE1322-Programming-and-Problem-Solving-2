class Employee extends Person
{
   //Declaring variables
   String office;
   String salary;
   MyDate hireDate;
   
   public Employee(String name,String address,String phoneNumber,String emailAddress,String office,String salary,MyDate hireDate)//Parameterized constructor
   { 
      super(name,address,phoneNumber,emailAddress);//Refers to the super class called Person
      this.office=office;
      this.salary=salary;
      this.hireDate=hireDate;
   }
   
   public String toString()
    {
        String a="Class name: Employee\nName: "+this.name+"\nAddress: "+this.address+"\nPhone Number: "+this.phoneNumber+"\nEmail Address: "+this.emailAddress+"\nOffice: "+this.office+"\nSalary: "+this.salary+"\nDate Hired: "+this.hireDate;
        return a;
    }

}
