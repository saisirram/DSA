import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Brute Force: " + bruteForceSolution(a, b));
        System.out.println("Optimal: " + optimalApproach(a, b));

    }

    // Largest number that is divisible by both the numbers
    // to check it loop through the number from 1 to min(a,b)
    // you can also loop it from the end like for (int i = min(a,b); i > 1 ; i--)
    // so if a%i ==0 && b%i ==0 then break and return i.
    // Since we want to print the largest common factor better we come from backward.
    // even this in worst case where GCD = 1 runs O(min(a,b))
    public static int bruteForceSolution(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    /*
     * The Euclidean algorithm is based on the below facts:
     * If we subtract the smaller number from larger (we reduce larger number), GCD doesn't change.
     * So if we keep subtracting repeatedly the larger of two, we end up with GCD.
     * Now instead of subtraction, if we divide the smaller number, the algorithm stops when the remainder is found to be 0.
     * Assuming a > b
     * */
    public static int optimalApproach(int a, int b) {
        if (b == 0) {
            return a;
        }
        return optimalApproach(b, a % b);
    }

}
