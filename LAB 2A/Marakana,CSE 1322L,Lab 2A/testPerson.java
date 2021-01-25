class testPerson
{
    public static void main(String [] args)
    {
        MyDate date=new MyDate(1,30,2019);//Object date on class MyDate
        Person person = new Person("Rutvik", "533 John Street", "000-000-0000", "Rutvik@gmail.com");//Object person of class Person 
 
        Student student = new Student("John", "433 Rutvik Street", "111-111-1111", "John@yahoo.com","Freshmen");//Object student of class student
 
        Employee employee = new Employee("Sam", "333 David Street", "222-222-2222", "Sam@gmail.com","Atlanta","$1,500,000",date); //Object employee of class Employee
 
        Faculty faculty = new Faculty("David", "233 Doug Street", "333-333-3333","David@yahoo.com","Atlanta","$50,000",date,"9am-5pm","Dean of Computer Science");//Object faculty of class Faculty 
 
        Staff staff = new Staff("Doug", "123 Sam Street", "444-444-4444", "Doug@gmail.com","Atlanta","$12,000",date,"Electrician");//Object staff of class staff 
        
        System.out.println(person.toString());
        System.out.println();
        System.out.println(student.toString());
        System.out.println();
        System.out.println(employee.toString());
        System.out.println();
        System.out.println(faculty.toString());
        System.out.println();
        System.out.println(staff.toString());
    }
}