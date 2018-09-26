package Factorial;

public class TailFactorial {
    public static long calculateFactorial(final int n, int a) {
        if(n == 0 || n == 1)
            return a;
        else
            return calculateFactorial(n - 1, n * a);
    }

    public static void main(String[] args) {
        long fact = calculateFactorial(6, 1);
        System.out.println(fact);
    }
}
