import java.util.concurrent.ForkJoinPool;

public class Main_fib{

    public static void main(String[] args) {

        ForkJoinFibonacci task = new ForkJoinFibonacci(10);
        new ForkJoinPool().invoke(task);

        System.out.println(task.getNumber());

    }

}
