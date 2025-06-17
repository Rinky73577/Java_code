import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        // user input

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your number");
        // int num = sc.nextInt();

        int num = 200;
        System.out.println("fibonacci Series");
        fibonacci(num);
    }

    public static void fibonacci(int num1) {
        if (num1 < 0)
            return;
        System.out.println("0 ");
        if (num1 == 0)
            return;
        System.out.println("1 ");
        int first = 0, second = 1;
        while (first + second <= num1) {
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }
    }
}
