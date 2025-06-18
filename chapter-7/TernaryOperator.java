import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number: \n");
        int num1 = sc.nextInt();
        System.out.println("enter yout second number: ");
        int num2 = sc.nextInt();

        // if (num1 > num2) {
        // System.out.println("num 1 is greatest: " + num1);
        // } else {
        // System.out.println("num1 is gratest: " + num2);
        // }

        // int greaterNumber;
        // if (num1 > num2) {
        // greaterNumber = num1;
        // } else {
        // greaterNumber = num2;
        // }

        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greatest number");
    }
}
