import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        float percentage = 98.2f;

        if (percentage >= 90) {
            System.out.println("A");
        } else if (percentage >= 75) {
            System.out.println("B");
        } else if (percentage >= 60) {
            System.out.println("D");
        } else if (percentage >= 30) {
            System.out.println("D");
        } else {
            System.out.println("fail");
        }

        // user input

        Scanner sc = new Scanner(System.in);
        float percent = sc.nextFloat();

        if (percentage >= 90) {
            System.out.println("A");
        } else if (percentage >= 75) {
            System.out.println("B");
        } else if (percentage >= 60) {
            System.out.println("D");
        } else if (percentage >= 30) {
            System.out.println("D");
        } else {
            System.out.println("fail");
        }
    }
}
