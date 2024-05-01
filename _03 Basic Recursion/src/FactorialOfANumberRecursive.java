import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfANumberRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger number = sc.nextBigInteger();
        sc.close();
        BigInteger factorial = factorialRecursiveApproach(number);
        System.out.println(number + "! = " + factorial);

    }

    public static BigInteger factorialRecursiveApproach(BigInteger number) {
        if (number.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return number.multiply(factorialRecursiveApproach(number.subtract(BigInteger.ONE)));
    }
}
