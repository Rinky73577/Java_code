import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int year = 2100;

        if (year % 400 == 0) {
            System.out.println("leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");

        } else if (year % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }

        // user iinput

        Scanner sc = new Scanner(System.in);
        int yr = sc.nextInt();

        if (yr % 400 == 0) {
            System.out.println("leap year");

        } else if (yr % 4 == 0 && yr % 100 != 0) {
            System.out.println(" leap year");
        } else {
            System.out.println("not a leap year");
        }

        // simplefied code

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("leap year");

        } else {
            System.out.println("not a leap year");
        }
    }
}
