public class Example_throws{  
   int division(int a, int b) throws ArithmeticException{  
	int t = a/b;
	return t;
   }  
   public static void main(String args[]){  
	Example_throws obj = new Example_throws();
	try{
	   System.out.println(obj.division(15,0));  
	}
	catch(ArithmeticException e){
	   System.out.println("You shouldn't divide number by zero");
	}
   }  
}