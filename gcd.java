import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        // user input

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter first number: ");
        // int num1 = sc.nextInt();
        // System.out.println("enter second number: ");
        // int num2 = sc.nextInt();

        int num1 = 15;
        int num2 = 30;

        int gcd = gcd(num1, num2);
        System.out.println(gcd);
    }

    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;

        } else {
            return num2;
        }
    }
}
