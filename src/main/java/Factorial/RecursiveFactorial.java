package Factorial;

public class RecursiveFactorial {
    public static long calculateFactorial(final int n) {

        if(n == 0 || n == 1)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        long fact = calculateFactorial(25);
        System.out.println(fact);
    }
}
