import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * We generally extract digits from last in given number
 * so now to append the next number to the initial number we need the units place of it as 0
 * because of it we multiply it with 10 so then the units place will be zero. then we add the next digit to it
 * Ex: 123
 * initial reverse num = 0
 * so
 * 0 * 10 + 3 = 3
 * 3 + 10 + 2 = 32
 * 32 * 10 + 1 = 321
 * */
public class ReverseNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        System.out.println("Original Number: " + number);
        int reverseNum = 0;
        while (number > 0) {
            reverseNum = (reverseNum * 10) + (number % 10);
            number /= 10;
        }
        System.out.println("Reversed Number: " + reverseNum);
    }

}
