import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // user input

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your number: ");
        // int num = sc.nextInt();

        int num = 143;
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not an armstrong number");
        }
    }

    public static boolean isArmstrong(int num) {
        int digits = noOfDigit(num);
        int numcopy = num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += power(lastDigit, digits);

        }
        return finalNumber == numcopy;

    }

    public static int power(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigit(int num) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num /= 10;
        }
        return digit;
    }
}
