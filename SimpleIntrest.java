import java.util.*;

public class SimpleIntrest {
    public static void main(String[] args) {

        int P = 10000;
        float T = 8.5f;
        int R = 3;

        float intrest = (T * R * P) / 100;

        System.out.println("compund intrest: " + intrest);

        // user input (Principal * Rate * Time / 100)

        Scanner sc = new Scanner(System.in);
        int P1 = sc.nextInt();
        System.out.println("Enter your principal, P1: ");

        int T1 = sc.nextInt();
        System.out.println("Rate of intrest, T1: ");

        int R1 = sc.nextInt();
        System.out.println("numbers of years, R1: ");

        System.out.println("compund intrest: " + ((P1 * T1 * R1) / 100));

    }
}
