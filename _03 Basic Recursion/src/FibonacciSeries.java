import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fibonacciNumbers(n));
    }

    /*
    * A Fibonacci series is the sum of last and second last element
    * it starts with 0 1
    * then the next fib is 0 + 1 = 1 (0 1 1)
    * the next fib is 1 + 1 = 2 (0 1 1 2)
    * the next fib is 1 + 2 = 3 (0 1 1 2 3)
    * so the series is like 0 1 1 2 3 5 8 13  . . . . . .
    * fib (n) = fib(n-1) + fib(n-2)
    * */
    public static int fibonacciNumbers(int n) {
        if (n <= 1) {
            return n;
        }
//        int last = fibonacciNumbers(n -1);
//        int slast = fibonacciNumbers(n-2);
//        return last + slast;
        return fibonacciNumbers(n -1) + fibonacciNumbers(n-2);
    }
}
