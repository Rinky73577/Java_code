import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        int table = 36;
        multiplication(table);

        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tour number: ");
        int num = sc.nextInt();
        multiplication(table);

    }

    // method
    public static void multiplication(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "X" + i + "=" + num * i);
            i++;
        }
    }

}
