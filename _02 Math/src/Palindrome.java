import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int originalNumber = number;
        System.out.println("Original Number: " + number);
        int reverseNum = 0;
        while (number > 0) {
            reverseNum = (reverseNum * 10) + (number % 10);
            number /= 10;
        }
        System.out.println("Reversed Number: " + reverseNum);
        if (originalNumber == reverseNum) {
            System.out.println("Given number: " + originalNumber + " is palindrome");
        } else {
            System.out.println("Given number: " + originalNumber + " is not palindrome");
        }
    }
}
