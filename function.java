public class function {
    // main method
    public static void main(String[] args) {
        greeting();

        firstPattern();
        // secondPattern();
        // thirdPattern();
    }

    // method
    public static void greeting() {
        System.out.println("Good morning");
    }

    public static void firstPattern() {
        // System.out.println("*");
        // System.out.println("* *");
        // System.out.println("* * *");
        // System.out.println("* * * *");
        // System.out.println("* * * * *");

        // loop
        int row = 0;
        while (row < 5) {
            System.out.print("*");
            int i = 0;
            while (i < row) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }

    public static void secondPattern() {
        // System.out.println("* * * * *");
        // System.out.println("* * * *");
        // System.out.println("* * *");
        // System.out.println("* *");
        // System.out.println("*");

        // loop

    }

    public static void thirdPattern() {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
}
