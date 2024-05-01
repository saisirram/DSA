import java.math.BigInteger;
import java.util.Scanner;

public class Print1toNUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger number = sc.nextBigInteger();
        sc.close();
        System.out.println("Forward Approach: ");
        forwardRecursiveApproach(BigInteger.ONE, number);
        System.out.println();
        System.out.println("Backward Approach: ");
        backwardRecursiveApproachToPrint1toN(number, number);
    }

    /*
     * In forward recursive Approach, the print statement is above the recursive call.
     * so it prints first and then goes to next recursive call
     * */
    public static void forwardRecursiveApproach(BigInteger i, BigInteger n) {
        if (i.compareTo(n) > 0) { // if i > n
            return;
        }
        System.out.print(i + " ");
        forwardRecursiveApproach(i.add(BigInteger.ONE), n);
    }

    /*
     * In backward recursive Approach, the print statement is below the recursive call.
     * so it starts prints at last once the base case is met.
     * */
    public static void backwardRecursiveApproachToPrint1toN(BigInteger i, BigInteger n) {
        if (i.compareTo(BigInteger.ONE) < 0) { // if  i < 1
            return;
        }
        backwardRecursiveApproachToPrint1toN(i.subtract(BigInteger.ONE), n);
        System.out.print(i + " ");
    }
}
