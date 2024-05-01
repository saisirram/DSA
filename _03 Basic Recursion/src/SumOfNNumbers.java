import java.math.BigInteger;
import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        sc.close();
        System.out.println("Parameterized Approach: ");
        System.out.println("Sum of first " + number + " natural numbers = " + parameterizedApproach(number, 0));
        System.out.println("Functional Approach: ");
        System.out.println("Sum of first " + number + " natural numbers = " + functionalApproach(number));

    }

    /*
    There are different patterns to solve a problem using recursion one among them is
    * in Parameterized Approach the sum variable is passed in all the recursive calls and we are adding to it.
    * */
    public static long parameterizedApproach(long number, long sum) {
        if (number == 0) {
            return sum;
        }
        return parameterizedApproach(number - 1, sum + number);
    }

    /*
    * Incase of functional Approach we are actually getting the result and adding it up (like backward recursion)
    * */
    public static long functionalApproach(long number) {
        if (number == 1) {
            return 1;
        }
        return number + functionalApproach(number - 1);
    }
}
