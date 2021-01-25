import java.util.Scanner;
class ClothesStack
{
   
   String name;
   String color;
   boolean HighTempWash;
   
   public ClothesStack(String name,String color,boolean HighTempWash)
   {
      this.name=name;
      this.color=color;
      this.HighTempWash=HighTempWash;
   }
   
   public String getName()
   {
      return name;
   }
   public String getColor()
   {
      return color;
   }
   public boolean getHighTempWash()
   {
      return HighTempWash;
   }
   public String toString()
  {
     return "[Cloth type: "+getName()+", Color: "+getColor()+", The cloth can be given a high temperature wash: "+getHighTempWash()+"]";
  }
}
class Stack
{
   ClothesStack[] c1=new ClothesStack[20];
   int total;
   
   public Stack()
   {
      total=-1;
   }
   
   public void push(ClothesStack c)
   {
     
       if(total>=19)
       {
          System.out.println("The stack is full");
       }
       else
       {
           total++;
           c1[total]=c;
           System.out.println("Pushed: "+c1[total]);
       }
   }
   
   public void pop()
   {
      if(total==-1)
      {
         System.out.println("The stack is empty");
      }
      else
      {
         
         ClothesStack clothes=c1[total];
         System.out.println("Popped: "+clothes);
         total--;
      }
  }
  
  public ClothesStack peek()
  {
    if(total==-1)
    {
        System.out.println("The stack is empty");
        return null;
    }
    else
    {
        return c1[total];
    }
  }
  
  public ClothesStack[] getSameColorClothes(String clothColor)
  {
     ClothesStack[] sameColorClothes=new ClothesStack[20];
     int count=0;
     
     for(int i=0;i<total;i++)
     {
        if(c1[i].getColor().equalsIgnoreCase(clothColor))
        {
            sameColorClothes[count]=c1[i];
            count++;
        }
     }
     return sameColorClothes;
  }
  
  public ClothesStack[] getHighTempWashAllowedClothes()
  {
      ClothesStack[] highTempAllowedClothes=new ClothesStack[20];
      int count=0;
      for(int i=0;i<total;i++)
      {
          if(c1[i].getHighTempWash())
          {
            highTempAllowedClothes[count]=c1[i];
            count++;
          }
      }
      return highTempAllowedClothes;
  }
}
class Main
{
public static void main(String [] args)
{
   int n=0;
   Stack s=new Stack();
   Scanner sc1=new Scanner(System.in);
   System.out.print("Enter NO if you dont want to enter any cloth otherwise press any key: ");
   String a=sc1.nextLine();
   while(n<=19 && !a.equals("NO"))
   {
      Scanner sc2=new Scanner(System.in);
      System.out.print("Enter the cloth type :");
      String name=sc2.nextLine();
      System.out.print("Enter the color of cloth: ");
      String color=sc2.nextLine();
      System.out.print("Enter true if cloth allows high temperature wash else enter false: ");
      boolean decision=sc2.nextBoolean();
      ClothesStack c=new ClothesStack(name,color,decision);
      System.out.println();
      System.out.println(c.toString());
      s.push(c);
      System.out.println();
      Scanner sc3=new Scanner(System.in);
      System.out.print("Do you want to enter another cloth (Enter NO if you dont want to otherwise press any key) ");
      a=sc3.nextLine(); 
      n++;
   }
 
   System.out.println();
   System.out.println("Clothes with color Blue in the Stack: ");
   for(ClothesStack clothes:s.getSameColorClothes("Blue"))
   {
       if(clothes==null)
       {
          break;
       }
       System.out.println(clothes);
   }
   System.out.println();
   System.out.println("Clothes with color Red in the Stack: ");
   for(ClothesStack clothes:s.getSameColorClothes("Red"))
   {
      if(clothes==null)
      {
         break;
      }
      System.out.println(clothes);
   }
   System.out.println();
   System.out.println("Clothes that can be washed at High Temperature: ");
   for(ClothesStack clothes:s.getHighTempWashAllowedClothes())
   {
      if(clothes==null)
      {
         break;
      }
      System.out.println(clothes);
   }
   
   System.out.println();

   s.pop();
   System.out.println("Peeked: "+s.peek());
   s.pop();
   System.out.println("Peeked: "+s.peek());
}}
   
   

   