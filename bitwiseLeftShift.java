import java.util.Scanner;

public class bitwiseLeftShift {
    public static void main(String[] args) {
        int a = 4;

        int result = a << 4;
        System.out.println(result);

        // user input
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result1 = num << 1;
        System.out.println(result1);
    }
}
