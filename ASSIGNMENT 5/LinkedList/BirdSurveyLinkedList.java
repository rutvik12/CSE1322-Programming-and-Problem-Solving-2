import java.util.Scanner;
    public class BirdSurveyLinkedList
    {
        private node first;

        public class node
        {
            public String birdName;
            public node next;
            public int count;

            public node(String birdName, node NewNode, int count)
            {
                this.birdName = birdName;
                this.next = NewNode;
                this.count = count;
            }
            public String getBird()
            {
               return birdName;
            }
            public int getCount()
            {
                return count;
            }
            
            public void setCount(int count)
            {
                this.count = count;
            }
        }

        public BirdSurveyLinkedList()
        {
            first = null;
        }

        public void add(String bird)
        {
            if (first == null)
            {
                first = new node(bird, null, 1);
            }
            else
            {
                boolean found = false;
                node curr = first;
                while (curr.next!= null && !found)
                {
                    if (curr.birdName.equals(bird))
                    {
                        found = true;
                        break;
                    }
                    else
                    {
                        curr = curr.next;
                    }
                }
                if (found)
                {
                    curr.setCount(curr.getCount()+1);
                }
                else
                {
                    first = new node(bird, first, 1);
                }
            }
        }

        public int getCount(String bird)
        {
            node curr = first;

            while (curr.next!=null)
            {
                if (curr.birdName.equals(bird))
                {
                    return curr.getCount();
                }

                curr=curr.next;
            }

            return 0;
        }

        public void getReport()
        {
            node curr=first;
            while (curr != null)
            {
                System.out.println("Bird Name is " + curr.getBird()+ " and count is " + curr.getCount()+ ".");
                curr=curr.next;
            }
        }
    }

class MainClass
{
        public static void main(String[] args)
        {

            String bird;
            BirdSurveyLinkedList list = new BirdSurveyLinkedList();
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the bird(Enter NO if you dont want to enter any birds): ");
            bird=sc.nextLine();
            while(!bird.equals("NO"))
            {
               list.add(bird);
               System.out.println("Added " +bird+ " and there is now "+list.getCount(bird)+" of them");
               System.out.println();
               System.out.print("Enter another bird (Enter NO if you dont want to enter any other bird: ");
               bird=sc.nextLine();
            }
            System.out.println();
            System.out.print("Enter the name of the bird for which you want to get count (Enter NO when you dont want the count of any birds): ");
            bird=sc.nextLine();
            
            while(!bird.equals("NO"))
            {
               System.out.println("Counted "+list.getCount(bird)+" "+bird+"(s)");
               System.out.println();
               System.out.print("Enter the name of the bird for which you want to get count (Enter NO when you dont want the count of any other bird): ");
               bird=sc.nextLine();
            }
            System.out.println();
            System.out.println("Report of all birds:");
            list.getReport();
       }
}

