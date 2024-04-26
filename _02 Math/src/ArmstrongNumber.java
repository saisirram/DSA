import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitCount = (int) (Math.floor(Math.log10(n)) + 1);
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum = (int) (sum + Math.pow(temp % 10, digitCount));
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println("Given Number: " + n + " is Armstrong Number");
        } else {
            System.out.println("Given Number: " + n + " is not Armstrong Number");
        }
    }
}
