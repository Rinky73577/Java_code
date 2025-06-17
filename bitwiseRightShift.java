import java.util.Scanner;

public class bitwiseRightShift {
    public static void main(String[] args) {
        int a = 10;

        int result = a >> 1;
        System.out.println(result);

        // user input
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();

        int result1 = a >> 3;
        System.out.println(result1);
    }
}
