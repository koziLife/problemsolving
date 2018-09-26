package Factorial;

public class IterativeFactorial {
    public static long calculateFactorial(final int n) {
        if(n < 0)
            throw new RuntimeException("Number must be positive integer");
        else if(n == 0 || n== 1)
            return 1;
        else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        long fact = calculateFactorial(-2);
        System.out.println(fact);
    }
}
