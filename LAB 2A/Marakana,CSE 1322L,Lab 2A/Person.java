public class Person
{
   //Declaring private variables
   String name;
   String address;
   String phoneNumber;
   String emailAddress;
   
   public Person(String name,String address,String phoneNumber,String emailAddress)//Parameterized constructor
   {
      this.name=name;
      this.address=address;
      this.phoneNumber=phoneNumber;
      this.emailAddress=emailAddress;
   }
   //Override of toString() method   
   public String toString()
   {
       String a="Class name: Person\nName: "+this.name+"\nAddress: "+this.address+"\nPhone Number: "+this.phoneNumber+"\nEmail Address: "+this.emailAddress;
       return a;
   }
}




    
   
   
  