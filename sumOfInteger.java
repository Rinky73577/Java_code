import java.util.Scanner;

public class sumOfInteger {
    public static void main(String[] args) {
        // user input

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your number: ");
        // int num = sc.nextInt();

        int num = 567;
        int sum = sumOfInteger(num);
        System.out.println(sum);

    }

    public static int sumOfInteger(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;

        }
        return sum;
    }

}
