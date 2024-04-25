import java.math.BigInteger;
import java.util.Arrays;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("123456787654321"); // String to bigInteger
        BigInteger bigIntegerFromLong = BigInteger.valueOf(-12423456L); // Long to BigInteger (you can also you ints in the param as well

        System.out.println("Big Integer from String: "+ bigInteger);

        /*
        *  extracts as long value.
        *  You can use intValue(), floatValue() as well
        *  but remember the BigInteger number should be in the valid data type rage that you want to convert.
        * */
        System.out.println("Big Integer from Long: " + bigIntegerFromLong.longValue());

        //Operations
        System.out.println("Addition "+ bigInteger.add(bigIntegerFromLong));
        System.out.println("Subtraction: " + bigInteger.subtract(bigIntegerFromLong));
        System.out.println("Multiply: " + bigInteger.multiply(bigIntegerFromLong));
        System.out.println("Division: " + bigInteger.divide(bigIntegerFromLong));
        System.out.println("Power: " + bigInteger.pow(3));
        System.out.println("Min: " + bigInteger.min(bigIntegerFromLong));
        System.out.println("Max: " + bigInteger.max(bigIntegerFromLong));
        System.out.println("Absolute: " + bigIntegerFromLong.abs());
        System.out.println("Mod: " + bigInteger.mod(bigIntegerFromLong.abs()));
        //This method returns an array of two BigIntegers
        //whose first value (at index 0) is big1/big2 and second value (at index 1) is big1%big2.
        System.out.println("Divide and Reminder: " + Arrays.stream(bigInteger.divideAndRemainder(bigIntegerFromLong)).toList());
        System.out.println("Equals: " + bigInteger.equals(bigIntegerFromLong));
        /*
        * This method is used to compare two BigInteger values.
        * Returns -1 if A < B
        * Returns  0 if A = B
        * Returns  1 if A > B
        * */
        System.out.println("CompareTo: " + bigInteger.compareTo(bigIntegerFromLong));

        System.out.println("GCD: " + bigInteger.gcd(bigIntegerFromLong));
        System.out.println("Probable prime: " + bigInteger.isProbablePrime(50));

    }
}
