import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        int i = 1; // initialization

        while (i <= 10) { // condition
            System.out.println(i);
            i = i + 1; // updating i
        }

        int count = 500;
        while (count >= 200) {
            System.out.println(count);
            count--;
        }

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count1 = 0;
        while (count1 < 5) {
            System.out.println(count1);
            count++;
        }
    }
}
