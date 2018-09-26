package Fibonacci;

public class TailRecursiveFibonacci {
    public static long calculateFib(final long n, long first, long acc) {
       if(n == 0)
           return first;
       else if(n == 1)
           return acc;
       else
           return calculateFib(n-1, acc, first+acc);
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long fib = calculateFib(120, 0, 1);
        System.out.println(fib);
        long finishTime = System.currentTimeMillis();

        System.out.println((finishTime - startTime) / 1000);
    }
}
