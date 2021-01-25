public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable
{
    private double side;
    public Octagon(double side)
    {
       super();
       this.side=side;
    }
    
    public void setSide(double side)
    {
       this.side=side;
    }
    
    public double getSide()
    {
       return this.side;
    }
    public double getArea()
    {
       return (2+(4/(Math.sqrt(2))))*side*side;
    }
    
    public double getPerimeter()
    {
       return side*8;
    }
    
    public int compareTo(Octagon o1)
    {
       if(getArea()==o1.getArea())
       {
          return 0;
       }
       else if(getArea() < o1.getArea())
       {
          return -1;
       }
       else
       {
         return 1;
       }
    }
    
    public Object clone()
    {
       return new Octagon(this.side);
    } 
    
    
}
