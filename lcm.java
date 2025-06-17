import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("enter your 2nd number: ");
        int num2 = sc.nextInt();
        int lcm = lcm(num1, num2);
        System.out.println(lcm);

    }

    public static int lcm(int num1, int num2) {
        int i = 1;
        while (true) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }

    }
}
