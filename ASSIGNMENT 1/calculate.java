import java.util.Scanner;
class calculate
{
   public static void main(String [] args)
   {
      Tests obj1=new Tests("Jack","Johnson",85,83,77,91,76);//Creating object obj1 with certain parameters
      obj1.setTestGrades(85,83,77,91,76);
      double[] arr1=obj1.getGrades();
      double avg1=obj1.average(arr1);
      char g1=obj1.grades(avg1);
      
      Tests obj2=new Tests("Lisa","Aniston",80,90,95,93,48);//Creating object obj2 with certain parameters
      obj2.setTestGrades(80,90,95,93,48);
      double[] arr2=obj2.getGrades();
      double avg2=obj2.average(arr2);
      char g2=obj2.grades(avg2);
      
      Tests obj3=new Tests("Andy","Cooper",78,81,11,90,70);//Creating object obj3 with certain parameters
      obj3.setTestGrades(78,81,11,90,70);
      double[] arr3=obj3.getGrades();
      double avg3=obj3.average(arr3);
      char g3=obj3.grades(avg3);
      
      Tests obj4=new Tests("Ravi","Gupta",92,83,30,69,87);//Creating object obj4 with certain parameters
      obj4.setTestGrades(92,83,30,69,87);
      double[] arr4=obj4.getGrades();
      double avg4=obj4.average(arr4);
      char g4=obj4.grades(avg4);

      Tests obj5=new Tests("Bonny","Blair",23,45,96,38,59);//Creating object obj5 with certain parameters
      obj5.setTestGrades(23,45,96,38,59);
      double[] arr5=obj5.getGrades();
      double avg5=obj5.average(arr5);
      char g5=obj5.grades(avg5);

      Tests obj6=new Tests("Danny","Clark",60,85,45,39,67);//Creating object obj6 with certain parameters
      obj6.setTestGrades(60,85,45,39,67);
      double[] arr6=obj6.getGrades();
      double avg6=obj6.average(arr6);
      char g6=obj6.grades(avg6);

      Tests obj7=new Tests("Sam.","Kennedy",77,31,52,74,83);//Creating object obj7 with certain parameters
      obj7.setTestGrades(77,31,52,74,83);
      double[] arr7=obj7.getGrades();
      double avg7=obj7.average(arr7);
      char g7=obj7.grades(avg7);

      Tests obj8=new Tests("Robin","Bronson",93,94,89,77,97);//Creating object obj8 with certain parameters
      obj8.setTestGrades(93,94,89,77,97);
      double[] arr8=obj8.getGrades();
      double avg8=obj8.average(arr8);
      char g8=obj8.grades(avg8);
      
      Tests obj9=new Tests("Sun","Xie",79,85,28,93,82);//Creating object obj9 with certain parameters
      obj9.setTestGrades(79,85,28,93,82);
      double[] arr9=obj9.getGrades();
      double avg9=obj9.average(arr9);
      char g9=obj9.grades(avg9);

      Tests obj10=new Tests("Kiran","Patel",85,72,49,75,63);//Creating object obj10 with certain parameters
      obj10.setTestGrades(85,72,49,75,63);
      double[] arr10=obj10.getGrades();
      double avg10=obj10.average(arr10);
      char g10=obj10.grades(avg10);

      Scanner sc=new Scanner(System.in);//Takes user input
      System.out.print("Enter the firstName of first student: ");//Asks the user to enter first name
      String fn1=sc.nextLine();
      System.out.print("Enter the lastName of first student: ");//Asks the user to enter last name
      String ln1=sc.nextLine();
      System.out.print("Enter the scores of 5 tests of first student: ");//Asks the user to enter scores of five tests
      double t1=sc.nextDouble();
      double t2=sc.nextDouble();
      double t3=sc.nextDouble();
      double t4=sc.nextDouble();
      double t5=sc.nextDouble();
      Tests obj11=new Tests(fn1,ln1,t1,t2,t3,t4,t5);//Creates object obj11 with certain parameters
      obj11.setTestGrades(t1,t2,t3,t4,t5);
      double [] arr11=obj11.getGrades();
      double avg11=obj11.average(arr11);
      char g11=obj11.grades(avg11);
      
      Scanner sc1=new Scanner(System.in);//Takes user input
      System.out.print("Enter the firstName of second student: ");//Asks the user to enter first name
      String fn2=sc1.nextLine();
      System.out.print("Enter the lastName of second student: ");//Asks the user to enter last name
      String ln2=sc1.nextLine();
      System.out.print("Enter the scores of 5 tests of second student: ");//Asks the user to enter scores of five tests
      double t6=sc1.nextDouble();
      double t7=sc1.nextDouble();
      double t8=sc1.nextDouble();
      double t9=sc1.nextDouble();
      double t10=sc1.nextDouble();
      Tests obj12=new Tests(fn2,ln2,t6,t7,t8,t9,t10);//Creates object obj12 with certain parameters
      obj12.setTestGrades(t6,t7,t8,t9,t10);
      double[] arr12=obj12.getGrades();
      double avg12=obj12.average(arr12);
      char g12=obj12.grades(avg12);
      
      Scanner sc2=new Scanner(System.in);//Takes user input
      System.out.print("Enter the firstName of third student: ");//Asks the user to enter first name
      String fn3=sc2.nextLine();
      System.out.print("Enter the lastName of third student: ");//Asks the user to enter last name
      String ln3=sc2.nextLine();
      System.out.print("Enter the scores of 5 tests of third student: ");//Asks the user to enter scores of five tests
      double t11=sc.nextDouble();
      double t12=sc.nextDouble();
      double t13=sc.nextDouble();
      double t14=sc.nextDouble();
      double t15=sc.nextDouble();
      Tests obj13=new Tests(fn3,ln3,t11,t12,t13,t14,t15);//Creates object obj13 with certain parameters
      obj13.setTestGrades(t11,t12,t13,t14,t15);
      double [] arr13=obj13.getGrades();
      double avg13=obj13.average(arr13);
      char g13=obj13.grades(avg13);

      Scanner sc3=new Scanner(System.in);//Takes user input
      System.out.print("Enter the firstName of fourth student: ");//Asks the user to enter first name
      String fn4=sc3.nextLine();
      System.out.print("Enter the lastName of fourth student: ");//Asks the user to enter last name
      String ln4=sc3.nextLine();
      System.out.print("Enter the scores of 5 tests of fourth student: ");//Asks the user to enter scores of five tests
      double t16=sc3.nextDouble();
      double t17=sc3.nextDouble();
      double t18=sc3.nextDouble();
      double t19=sc3.nextDouble();
      double t20=sc3.nextDouble();
      Tests obj14=new Tests(fn4,ln4,t16,t17,t18,t19,t20);//Creates object obj14 with certain parameters
      obj14.setTestGrades(t16,t17,t18,t19,t20);
      double [] arr14=obj14.getGrades();
      double avg14=obj14.average(arr14);
      char g14=obj14.grades(avg14);

      Scanner sc4=new Scanner(System.in);//Takes user input
      System.out.print("Enter the firstName of fifth student: ");//Asks the user to enter first name
      String fn5=sc4.nextLine();
      System.out.print("Enter the lastName of fifth student: ");//Asks the user to enter last name
      String ln5=sc4.nextLine();
      System.out.print("Enter the scores of 5 tests of fifth student: ");//Asks the user to enter scores of five tests
      double t21=sc4.nextDouble();
      double t22=sc4.nextDouble();
      double t23=sc4.nextDouble();
      double t24=sc4.nextDouble();
      double t25=sc4.nextDouble();
      Tests obj15=new Tests(fn5,ln5,t21,t22,t23,t24,t25);//Creates object obj15 with certain parameters
      obj15.setTestGrades(t21,t22,t23,t24,t25);
      double [] arr15=obj15.getGrades();
      double avg15=obj15.average(arr15);
      char g15=obj15.grades(avg15);

      Scanner sc5=new Scanner(System.in);//Takes user input
      System.out.print("Enter the firstName of sixth student: ");//Asks the user to enter first name
      String fn6=sc5.nextLine();
      System.out.print("Enter the lastName of sixth student: ");//Asks the user to enter last name
      String ln6=sc5.nextLine();
      System.out.print("Enter the scores of 5 tests of sixth student: ");//Asks the user to enter scores of five tests
      double t26=sc5.nextDouble();
      double t27=sc5.nextDouble();
      double t28=sc5.nextDouble();
      double t29=sc5.nextDouble();
      double t30=sc5.nextDouble();
      Tests obj16=new Tests(fn6,ln6,t26,t27,t28,t29,t30);//Creates object obj16 with certain parameters
      obj16.setTestGrades(t26,t27,t28,t29,t30);
      double [] arr16=obj16.getGrades();
      double avg16=obj16.average(arr16);
      char g16=obj16.grades(avg16);

      Scanner sc6=new Scanner(System.in);//Takes user input
      System.out.print("Enter the firstName of seventh student: ");//Asks the user to enter first name
      String fn7=sc6.nextLine();
      System.out.print("Enter the lastName of seventh student: ");//Asks the user to enter last name
      String ln7=sc6.nextLine();
      System.out.print("Enter the scores of 5 tests of seventh student: ");//Asks the user to enter scores of five tests
      double t31=sc6.nextDouble();
      double t32=sc6.nextDouble();
      double t33=sc6.nextDouble();
      double t34=sc6.nextDouble();
      double t35=sc6.nextDouble();
      Tests obj17=new Tests(fn7,ln7,t31,t32,t33,t34,t35);//Creates object obj17 with certain parameters
      obj17.setTestGrades(t31,t32,t33,t34,t35);
      double [] arr17=obj17.getGrades();
      double avg17=obj17.average(arr17);
      char g17=obj17.grades(avg17);

      Scanner sc7=new Scanner(System.in);//Takes user input
      System.out.print("Enter the firstName of eighth student: ");//Asks the user to enter first name
      String fn8=sc7.nextLine();
      System.out.print("Enter the lastName of eighth student: ");//Asks the user to enter last name
      String ln8=sc7.nextLine();
      System.out.print("Enter the scores of 5 tests of eighth student: ");//Asks the user to enter scores of five tests
      double t36=sc7.nextDouble();
      double t37=sc7.nextDouble();
      double t38=sc7.nextDouble();
      double t39=sc7.nextDouble();
      double t40=sc7.nextDouble();
      Tests obj18=new Tests(fn8,ln8,t36,t37,t38,t39,t40);//Creates object obj18 with certain parameters
      obj18.setTestGrades(t36,t37,t38,t39,t40);
      double [] arr18=obj18.getGrades();
      double avg18=obj18.average(arr18);
      char g18=obj18.grades(avg18);
      
      Scanner sc8=new Scanner(System.in);//Takes user input
      System.out.print("Enter the firstName of ninth student: ");//Asks the user to enter first name
      String fn9=sc8.nextLine();
      System.out.print("Enter the lastName of ninth student: ");//Asks the user to enter last name
      String ln9=sc8.nextLine();
      System.out.print("Enter the scores of 5 tests of ninth student: ");//Asks the user to enter scores of five tests
      double t41=sc8.nextDouble();
      double t42=sc8.nextDouble();
      double t43=sc8.nextDouble();
      double t44=sc8.nextDouble();
      double t45=sc8.nextDouble();
      Tests obj19=new Tests(fn9,ln9,t41,t42,t43,t44,t45);//Creates object obj19 with certain parameters
      obj19.setTestGrades(t41,t42,t43,t44,t45);
      double [] arr19=obj19.getGrades();
      double avg19=obj19.average(arr19);
      char g19=obj19.grades(avg19);

      Scanner sc9=new Scanner(System.in);//Takes user input
      System.out.print("Enter the firstName of tenth student: ");//Asks the user to enter first name
      String fn10=sc9.nextLine();
      System.out.print("Enter the lastName of tenth student: ");//Asks the user to enter last name
      String ln10=sc9.nextLine();
      System.out.print("Enter the scores of 5 tests of tenth student: ");//Asks the user to enter scores of five tests
      double t46=sc9.nextDouble();
      double t47=sc9.nextDouble();
      double t48=sc9.nextDouble();
      double t49=sc9.nextDouble();
      double t50=sc9.nextDouble();
      Tests obj20=new Tests(fn10,ln10,t46,t47,t48,t49,t50);//Creates object obj20 with certain parameters
      obj20.setTestGrades(t46,t47,t48,t49,t50);
      double [] arr20=obj20.getGrades();
      double avg20=obj20.average(arr20);
      char g20=obj20.grades(avg20);

      //Calling and printing the return value of toString method of all the created objects
      System.out.println("Test 1");
      System.out.println("First Name  Last Name  Test1   Test2   Test3   Test4   Test5   Average   Grade");
      System.out.println(obj1.toString());
      System.out.println(obj2.toString());
      System.out.println(obj3.toString());
      System.out.println(obj4.toString());
      System.out.println(obj5.toString());
      System.out.println(obj6.toString());
      System.out.println(obj7.toString());
      System.out.println(obj8.toString());
      System.out.println(obj9.toString());
      System.out.println(obj10.toString());
      System.out.println();

      System.out.println("Test 2");
      System.out.println("First Name  Last Name  Test1   Test2   Test3   Test4   Test5   Average   Grade");
      System.out.println(obj11.toString());
      System.out.println(obj12.toString());
      System.out.println(obj13.toString());
      System.out.println(obj14.toString());
      System.out.println(obj15.toString());
      System.out.println(obj16.toString());
      System.out.println(obj17.toString());
      System.out.println(obj18.toString());
      System.out.println(obj19.toString());
      System.out.println(obj20.toString());
      
    }
}  