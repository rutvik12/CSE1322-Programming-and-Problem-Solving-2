public class Student extends Person//Class Student inherits class Person
{
    //Declaring variables
    private String classStatus;
    
    public Student(String name,String address,String phoneNumber,String emailAddress,String classStatus)//Parameterized constructor
    {  
       super(name,address,phoneNumber,emailAddress);//Refers to the super class called Person
       this.classStatus=classStatus;
    }
    
    public String toString()
    {
        String a="Class name: Student\nName: "+this.name+"\nAddress: "+this.address+"\nPhone Number: "+this.phoneNumber+"\nEmail Address: "+this.emailAddress+"\nClass Status: "+this.classStatus;
        return a;
    }
}
