package Fibonacci;

public class IterativeFibonacci {

    public long calculateFib(final int n) {
        long preprev = 0;
        long prev = 1;
        long sum = 1;

        if (n == 0)
            return preprev;
        else if (n == 1)
            return prev;
        else {
            for (int i = 2; i <= n; i++) {
              sum = preprev + prev;
              preprev = prev;
              prev = sum;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long fib = new IterativeFibonacci().calculateFib(129);
        System.out.println(fib);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - startTime) / 1000);

    }
}
