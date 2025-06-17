import java.util.Scanner;

public class greatestOfThreeNo {
    public static void main(String[] args) {
        int a = 45;
        int b = 55;
        int c = 7;

        if (a > b && a > c) {
            System.out.println("a");
        } else if (b > a && a > c) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }

        // user input

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("First no: ");
        int num2 = sc.nextInt();
        System.out.println("second no: ");
        int num3 = sc.nextInt();
        System.out.println("third no: ");

        if (a > b && a > c) {
            System.out.println("a");
        } else if (b > a && a > c) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }
    }
}
