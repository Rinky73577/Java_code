import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter your number: ")
        // int num = sc.nextInt();
        int num = 25;
        long fact = factorial(num);
        System.out.println(fact);
    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}