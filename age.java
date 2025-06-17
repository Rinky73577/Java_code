import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        int age = 12;

        if (age < 13) {
            System.out.println("child");
        } else if (age < 20) {
            System.out.println("teen");
        } else if (age < 60) {
            System.out.println("adult");
        } else {
            System.out.println("senior citezen");
        }

        // user input
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();

        if (age1 < 13) {
            System.out.println("child");
        } else if (age1 < 20) {
            System.out.println("teen");
        } else if (age1 < 60) {
            System.out.println("adult");
        } else {
            System.out.println("senior citezen");
        }
    }

}
