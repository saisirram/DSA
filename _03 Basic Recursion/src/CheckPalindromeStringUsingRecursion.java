import java.util.Scanner;

public class CheckPalindromeStringUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (checkPalindrome(str, 0)) {
            System.out.println("Given string: " + str + " is a Palindrome");
        } else {
            System.out.println("Given string: " + str + " is not a Palindrome");
        }

    }

    /*
     * Palindrome: a String which is read as same in reverse.
     * Ex: MADAM
     * So to check if a string is a palindrome or not
     * rum a loop or recursion to check the charAt first and last is same or not.
     * if so then check the same until you reach middle.
     * if you reach middle that means all the chars at their ends are same. so you can return true.
     * */
    public static boolean checkPalindrome(String s, int i) {
        int n = s.length();
        if (i >= n / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) { //if charAt beginning and ending aren't same then it cannot be a palindrome
            return false;
        }
        return checkPalindrome(s, i + 1);
    }
}
