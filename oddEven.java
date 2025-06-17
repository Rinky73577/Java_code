import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        int num = 8;

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // user input

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println("Enter your number: ");

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
