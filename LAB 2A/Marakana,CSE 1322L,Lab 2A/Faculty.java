class Faculty extends Employee//Class Faculty inherits class Employee
{
    //Declaring variables
    String officeHours;
    String rank;
    
    public Faculty(String name,String address,String phoneNumber,String emailAddress,String office,String salary,MyDate hireDate,String officeHours,String rank)//Parameterized constructor
    {  
       super(name,address,phoneNumber,emailAddress,office,salary,hireDate);//Refers to the super class called Person
       this.officeHours=officeHours;
       this.rank=rank;
    }
    public String toString()
    {
        String a="Class name: Faculty\nName: "+this.name+"\nAddress: "+this.address+"\nPhone Number: "+this.phoneNumber+"\nEmail Address: "+this.emailAddress+"\nOffice: "+this.office+"\nSalary: "+this.salary+"\nDate Hired: "+this.hireDate+"\nOffice Hours: "+this.officeHours+"\nRank: "+this.rank;
        return a;
    }
}
