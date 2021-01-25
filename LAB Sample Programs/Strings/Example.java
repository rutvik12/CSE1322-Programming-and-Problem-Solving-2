public class Example{
public static void main(String args[]){ 
String s1="hello"; 
String s2="whatsup"; 
System.out.println("string length is: "+s1.length());  
System.out.println("string length is: "+s2.length()); 

String s3="hemlo"; 
String s4="hello";
String s5 ="Flag";

System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m" 
System.out.println(s1.compareTo(s4)); // 0 for equal string"
System.out.println(s1.compareTo(s5));

s1=s1.concat(" how are you");
System.out.println(s1);
String s6="";
String s7 ="JAVA";
System.out.println(s6.isEmpty());

String s7lower=s7.toLowerCase();
System.out.println(s7lower);
String s8 ="java";
String s8upper=s8.toUpperCase();  
System.out.println(s8upper);

String replaceString=s1.replace('h','t'); 
System.out.println(replaceString);
System.out.println(s1.substring(10));
System.out.println(s1.substring(15,16));
System.out.println(s5.indexOf('g'));
System.out.println(s5.indexOf('t'));
}}