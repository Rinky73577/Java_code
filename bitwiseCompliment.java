import java.util.Scanner;

public class bitwiseCompliment {
    public static void main(String[] args) {
        int a = 11;
        int result = ~a;
        System.out.println(result);

        // user input
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result1 = ~num;
        System.out.println(result1);
    }
}
