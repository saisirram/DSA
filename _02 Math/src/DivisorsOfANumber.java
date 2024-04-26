import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        System.out.println("Brute Force: " + bruteForceSolution(number));
        System.out.println("Better: " + betterSolution(number));
        System.out.println("Optimal: " + optimalSolution(number));
    }

    public static List<Integer> bruteForceSolution(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static List<Integer> betterSolution(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        divisors.add(number);
        return divisors;
    }

    public static List<Integer> optimalSolution(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
                if ((number / i) != i) {
                    divisors.add(number / i);
                }
            }
        }
        return divisors;
    }
}
