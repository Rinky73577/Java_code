import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        // user input

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your number: ");
        // int num = sc.nextInt();

        int num = 243;
        boolean ispalindrome = ispalindrome(num);
        if (ispalindrome) {
            System.out.println("palindrom");
        } else {
            System.out.println("not a palindrom");
        }
    }

    public static boolean ispalindrome(int num) {
        int reverse = reverse(num);
        return num == reverse;
    }

    public static int reverse(int num) {
        int num1 = 0;
        while (num > 0) {
            int digit = num % 10;
            num1 = num1 * 10 + digit;
            num /= 10;
        }
        return num1;
    }

}
