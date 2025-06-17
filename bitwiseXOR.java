import java.util.Scanner;

public class bitwiseXOR {
    public static void main(String[] args) {
        int a = 10;
        int b = 14;

        int result = a ^ b;
        System.out.println(result);

        // user input

        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        System.out.println("first no: ");
        int no2 = sc.nextInt();
        System.out.println("second no: ");

        int or = no1 ^ no2;
        System.out.println(result);
    }
}
