import java.util.Scanner;

public class loopPatterns {
    public static void main(String[] args) {
        // user inpur
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter number of rows: ");
        // int rows= sc.nextInt();

        int rows = 5;
        firstPattern(rows);
        secondPattern(rows);
        thirdPattern(rows);
    }

    public static void firstPattern(int maxRow) {
        System.out.println("here is the right halp pyramid");
        int rows = 0;
        while (rows < maxRow) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;

            }
            System.out.println();
            rows++;

        }
    }

    public static void secondPattern(int maxRow) {
        System.out.println("here is the reverse right halp pyramid");
        int rows = maxRow;
        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }

    }

    public static void thirdPattern(int maxRow) {
        System.out.println("\nhere is Left Half Pyramid: ");
        int rows = maxRow;
        while (rows > 0) {
            // this loop prints spaces
            int j = 0;
            while (j < rows - 1) {
                System.out.print("  ");
                j++;
            }

            // this loop prints stars
            int i = 0;
            while (i <= (maxRow - rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
