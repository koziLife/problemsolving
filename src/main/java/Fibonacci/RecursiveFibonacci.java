package Fibonacci;

public class RecursiveFibonacci {
    public long calculateFib(final int n) {
        if(n <= 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return calculateFib(n -1) + calculateFib(n - 2);
    }

    public static void main(String[] args) {
        long first = System.currentTimeMillis();
        long fib = new RecursiveFibonacci().calculateFib(45);
        long second = System.currentTimeMillis();
        System.out.println(fib);

        System.out.println("time: "+ (second - first) / 1000 );
    }
}
