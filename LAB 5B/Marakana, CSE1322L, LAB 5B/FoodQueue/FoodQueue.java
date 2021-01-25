import java.util.Scanner;
class FoodQueue
{
    String name;
    int numberOfCaloriesPerServing;
    int numberOfServingPerContainer;
    
    public FoodQueue(String name,int numberOfCaloriesPerServing,int numberOfServingPerContainer)
    {
       this.name=name;
       this.numberOfCaloriesPerServing=numberOfCaloriesPerServing;
       this.numberOfServingPerContainer=numberOfServingPerContainer;
    }
    
    public String getName()
    {
       return name;
    }
    
    public int getNumberOfCaloriesPerServing()
    {
       return numberOfCaloriesPerServing;
    }
    
    public int getNumberOfServingPerContainer()
    {
       return numberOfServingPerContainer;
    }
    
    public String toString()
    {
       String display="[Food Name: "+getName()+", Number of Calories Per Serving: "+getNumberOfCaloriesPerServing()+", Number of Serving Per Container: "+getNumberOfServingPerContainer()+"]";
       return display;
    }
}

class queue
{
    FoodQueue[] f1=new FoodQueue[20];
    int total;
    int front;
    int back;
    
    public queue()
    {
       total=-1;
       front=-1;
       back=-1;
    }
    
    public void enqueue(FoodQueue f)
    {
        if(total>=19)
        {
           System.out.println("The queue is already full");
        }
        else
        {
           total++;
           back=(back+1)%20;
           f1[back]=f;
           System.out.println("Enqueued: "+f1[back]);
           
           if(front==-1)
           {
              front=back;
           }
        }
    }
    
    public void dequeue()
    {
        if(total==-1)
        {
            System.out.println("The queue is empty");
        }
        else
        {
            FoodQueue food=f1[front];
            System.out.println("Dequeued: "+food);
            total--;
            front=(front+1)%20;
        }
    }
    
    public FoodQueue peek()
    {
       if(total==-1)
       {
           System.out.println("The queue is empty");
           return null;
       }
       else
       {
           return f1[front];
       }
    }
   
    public double getAverageCaloriesPerServingOfAllFoods()
    {
       double calories=0;
       double serving=0;
       
       for(FoodQueue food:f1)
       {
          if(food==null)
          {
             break;
          }
          else
          {
               calories=calories+food.getNumberOfCaloriesPerServing();
               serving=serving+food.getNumberOfServingPerContainer();
          }
       }
       double avg=calories/serving;
       return avg;
    }
    
    public FoodQueue getHighestTotalCaloriesFood()
    {
       FoodQueue highestCaloriesFood=null;
       int highestTotalCalories=0;
       
       for(FoodQueue food:f1)
       {
           if(food==null)
           {
               break;
           }
           else
           {
               int total=food.getNumberOfCaloriesPerServing()*food.getNumberOfServingPerContainer();
               if(total>highestTotalCalories)
               {
                   highestCaloriesFood=food;
                   highestTotalCalories=total;
               }
           }
       }
       return highestCaloriesFood;
   }
}

class MainClass
{
   public static void main(String [] args)
   {
       int n=0;
       queue q=new queue();
       Scanner sc1=new Scanner(System.in);
       System.out.print("Enter NO if you dont want to enter any food otherwise press any key: ");
       String a=sc1.nextLine();
       while(n<=19 && !a.equals("NO"))
       {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the food name :");
            String name=sc.nextLine();
            System.out.print("Enter the number of calories per serving for the food: ");
            int calories=sc.nextInt();
            System.out.print("Enter the number of servings per container: ");
            int servings=sc.nextInt();
            FoodQueue f=new FoodQueue(name,calories,servings);
            System.out.println();
            System.out.println(f.toString());
            q.enqueue(f);
            System.out.println();
            Scanner sc2=new Scanner(System.in);
            System.out.print("Do you want to enter another food (Enter NO if you dont want to otherwise press any key): ");
            a=sc2.nextLine();
            n++; 
      }

       
       System.out.println("Avergae calories per serving of all food: "+q.getAverageCaloriesPerServingOfAllFoods());
       System.out.println("Food with highest total calories: "+q.getHighestTotalCaloriesFood());
       
       q.dequeue();
       System.out.println("Peeked: "+q.peek());
       q.dequeue();
       System.out.println("Peeked: "+q.peek());
   }
}