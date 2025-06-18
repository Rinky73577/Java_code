import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);

        // swapping

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

        // user input

        Scanner sc = new Scanner((System.in));
        int no1 = sc.nextInt();
        System.out.println("Enter 1st number: ");
        int no2 = sc.nextInt();
        System.out.println("Enter 2nd number: ");

        int c = no1;
        no1 = no2;
        no2 = c;

        System.out.println(no1);
        System.out.println(no2);
    }
}
