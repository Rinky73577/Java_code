import java.util.Scanner;

public class sunOfTwoNos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st numbers: ");
        int no1 = sc.nextInt();
        System.out.println("Enter 2nd numbers: ");
        int no2 = sc.nextInt();
        int sum = no1 + no2;
        System.out.println("Sum of two numbers are: " + sum);
    }
}
