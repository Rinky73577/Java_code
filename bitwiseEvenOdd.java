import java.util.Scanner;

public class bitwiseEvenOdd {
    public static void main(String[] args) {
        int num = 4;

        if ((num & 1) == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
        // user input
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        if ((num & 1) == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
