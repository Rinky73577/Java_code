import java.util.Scanner;

public class RectParameter {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;

        System.out.println("Parameter of a rectangle abcd is: " + (a + b + c + d));

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        System.out.println("Parameter of a rectangle ABCD is: " + (A + B + C + D));

    }
}
