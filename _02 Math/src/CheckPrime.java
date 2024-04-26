import java.util.Scanner;

public class CheckPrime {
    //you can use divisors of a number concept to check if it is prime or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (checkPrime(number)) {
            System.out.println("Given number: " + number + " is prime number");
        } else {
            System.out.println("Given number: " + number + " is not prime number");
        }

    }

    public static boolean checkPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
