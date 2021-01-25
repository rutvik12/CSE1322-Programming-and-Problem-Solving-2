public class PiecemealVacation extends Vacation
{
    String[] items;
    double[] costs;
    
    public PiecemealVacation(double budget,String destination,String[] items,double[] costs)
    {
         super(budget,destination);
         this.items=items;
         this.costs=costs;
    }
    
    public double totalCost()
    {
       int total=0;
       for(int i=0;i<costs.length;i++)
       {
          total+=costs[i];
       }
       return total;
    }
    
    public double compareBudget()
    {
       return budget-totalCost();
    }
    
    public String toString()
    {
       String a="Budget: $"+budget+"\nCompare Budget: $"+compareBudget()+"\nDestination: "+destination+"\nHotel: "+items[0]+" $"+costs[0]+"\nMeal: "+items[1]+" $"+costs[1]+"\nAirfare: "+items[2]+" $"+costs[2];
       return a;
    }
}    