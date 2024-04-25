import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtractDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            System.out.println(digit);
            number = number / 10;
        }
        br.close();
    }


}
