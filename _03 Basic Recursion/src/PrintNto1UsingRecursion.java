import java.math.BigInteger;
import java.util.Scanner;

public class PrintNto1UsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger number = sc.nextBigInteger();
        sc.close();
        System.out.println("Forward Approach: ");
        forwardApproachToPrintNto1(number, number);
        System.out.println();
        System.out.println("Backward Approach: ");
        backwardApproachToPrintNto1(BigInteger.ONE, number);

    }

    public static void forwardApproachToPrintNto1(BigInteger i, BigInteger n) {
        if (i.compareTo(BigInteger.ONE) < 0) { // if i < 1 return
            return;
        }
        System.out.print(i + " ");
        forwardApproachToPrintNto1(i.subtract(BigInteger.ONE), n);
    }

    public static void backwardApproachToPrintNto1(BigInteger i, BigInteger n) {
        if (i.compareTo(n) > 0) { // if i > n return
            return;
        }
        backwardApproachToPrintNto1(i.add(BigInteger.ONE), n);
        System.out.print(i + " ");
    }
}
