import java.text.DecimalFormat;
class testOctagon
{
   public static void main(String [] args)
   {
      DecimalFormat d=new DecimalFormat(".##");
      
      Octagon o1=new Octagon(8.0);
      Octagon o2= (Octagon)o1.clone();
      o1.setSide(8.0); 
      
      System.out.println();
      System.out.println("Side of Octagon object o1: "+o1.getSide());
      System.out.println("Side of the cloned Octagon object o2: "+o2.getSide());
      System.out.println("Area of the Octagon object o1: "+d.format(o1.getArea()));
      System.out.println("Perimeter of the Octagon object o1: "+d.format(o1.getPerimeter()));
      System.out.println("Area of the cloned Octagono object o2: "+d.format(o2.getArea()));
      System.out.println("Perimeter of the cloned Octagon object o2: "+d.format(o2.getPerimeter()));


      if(o1.compareTo(o2) == 0)
      {
         System.out.println("Both objects are equal: true");
      }
      else
      {
         System.out.println("Both objects are equal: false");
      }
      System.out.println();
     
      o2.setSide(12.0);
      System.out.println("Side of Octagon object o1: "+o1.getSide());
      System.out.println("Side of the cloned Octagon object o2: "+o2.getSide());
      System.out.println("Area of the Octagon object o1: "+d.format(o1.getArea()));
      System.out.println("Perimeter of the Octagon object o1: "+d.format(o1.getPerimeter()));
      System.out.println("Area of the Octagon object o2: "+d.format(o2.getArea()));
      System.out.println("Perimeter of the Octagon object o2: "+d.format(o2.getPerimeter()));
 
      if(o1.compareTo(o2)==0)
      {
         System.out.println("Both objects are equal: true");
      }
      else
      {
         System.out.println("Both objects are equal: false");
      }
      
   }
}