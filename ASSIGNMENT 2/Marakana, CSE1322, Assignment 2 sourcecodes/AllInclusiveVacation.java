public class AllInclusiveVacation extends Vacation
{
    String brand;
    double rating;
    double price;
    
    public AllInclusiveVacation(double budget,String destination,String brand,double rating,double price)
    {
        super(budget,destination);
        this.brand=brand;
        this.rating=rating;
        this.price=price;
    }
    public double compareBudget()
    {
       return budget-price;
    }
    public String toString()
    {
        String a="Budget: $"+budget+"\nComapre Budget: $"+compareBudget()+"\nDestination: "+destination+"\nBrand: "+brand+"\nRating :"+rating+" stars\nPrice :$"+price;
        return a;
    }
}