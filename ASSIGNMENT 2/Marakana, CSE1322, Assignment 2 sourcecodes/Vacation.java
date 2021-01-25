abstract class Vacation
{
    double budget;
    String destination;
    
    public Vacation(double budget,String destination)
    {
        this.budget=budget;
        this.destination=destination;
    }
    public abstract double compareBudget();
    
    public String toString()
    {
       String a="Budget: $"+budget+"\nCompare Budget: $"+compareBudget()+"\nDestination: "+destination;
       return a;
    }
}