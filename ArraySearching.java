import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        // user input

        // Scanner sc = new Scanner(System.in);
        // int[] arr = {43,54,56,23,8,67,5,32,5,76,7};
        // System.out.println("enter the no you want to search: ");
        // int num = sc.nextInt();
        int[] arr = { 23, 32, 75, 54, 34, 76, 15, 6, 7, 65, 59 };

        int num = 34;
        boolean isfound = isfound(arr, num);
        if (isfound) {
            System.out.println("number was found in array");
        } else {
            System.out.println("your number was not found");
        }
    }

    public static boolean isfound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            System.out.println(arr[index]);
            index++;
        }
        return false;
    }
}
