import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimplerMathOperation {
    public static void main(String[] args) throws IOException {

        // Number of digits
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int secondNumber = Integer.parseInt(br.readLine());
        int digitCount = (int) (Math.log10(number) + 1);
        System.out.println("Number of Digits: " + digitCount);

        //even or odd
        if ((number & 1) == 0) {
            System.out.println("Given number: " + number + " is Even.");
        } else {
            System.out.println("Given number: " + number + " is Odd.");
        }

        // Multiply by 2
        System.out.println("Given number: " + number + " * 2 = " + (number << 1));

        //Divide by 2
        System.out.println("Given number: " + number + " / 2 = " + (number >> 1));

        //Swap two numbers
        System.out.println("Before Swapping First Number: " + number + " Second Number: " + secondNumber);
        number ^= secondNumber;
        secondNumber ^= number;
        number ^= secondNumber;
        System.out.println("After Swapping First Number: " + number + " Second Number: " + secondNumber);

        // Is power of 2
        if (number != 0 && (number & (number - 1)) == 0) {
            System.out.println("Given number: " + number + " is power of 2");
        } else {
            System.out.println("Given number: " + number + " is not power of 2");
        }
        br.close();
    }
}
