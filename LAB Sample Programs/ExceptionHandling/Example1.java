public class Example1{  
   void checkAge(int age){  
	if(age<18)  
	   throw new ArithmeticException("Not Eligible for voting");  
	else  
	   System.out.println("Eligible for voting");  
   }  
   public static void main(String args[]){  
	Example1 obj = new Example1();
	obj.checkAge(21);  
	System.out.println("End Of Program");  
   }  
}