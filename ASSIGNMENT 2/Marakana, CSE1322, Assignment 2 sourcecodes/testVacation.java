class testVacation
{
    public static void main(String [] args)
    {
        
        AllInclusiveVacation v2=new AllInclusiveVacation(5000.00,"Germany","Delta Vacations",3.00,6000.00);
        String[] items={"Hotel Palace","Street Vendors","United Airlines"};
        double[] costs={2000.00,1000.00,1500.00};
        PiecemealVacation v3=new PiecemealVacation(5000.00,"Japan",items,costs);
        String[] items1={"East Point Hotel","Hotel Buffet","Delta Airlines"};
        double[] costs1={3000.00,500.00,2000.00};
        PiecemealVacation v4=new PiecemealVacation(5000.00,"Australia",items1,costs1);
        Vacation v5=new AllInclusiveVacation(2000.00,"Mumbai","Jet Airways",2.00,6000.00); 
        AllInclusiveVacation v6=(AllInclusiveVacation) v5;
     
        System.out.println(v6.toString());
        System.out.println();
        System.out.println(v5.toString());
        System.out.println();
        System.out.println(v2.toString());
        System.out.println();
        System.out.println(v3.toString());
        System.out.println();
        System.out.println(v4.toString());
    }
}