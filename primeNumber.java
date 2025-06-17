import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        // user input

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println("Enter your number: ");

        int num = 25;
        boolean prime = prime(num);
        if (prime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    public static boolean prime(int number) {
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
