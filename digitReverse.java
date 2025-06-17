import java.util.Scanner;

public class digitReverse {
    public static void main(String[] args) {
        // user input

        // Scanner sc = new Scanner((System.in));
        // System.out.println("Enter your number: ");
        // int num = sc.nextInt();

        int num = 450;
        int reverse = reverse(num);
        System.out.println(reverse);

    }

    public static int reverse(int no) {
        int newnum = 0;
        while (no > 0) {
            int digit = no % 10;
            newnum = newnum * 10 + digit;
            no /= 10;
        }
        return newnum;

    }
}
