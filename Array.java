import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // int arr[] = new int[5];
        // arr[0] = 45;
        // arr[1] = 55;
        // arr[2] = 65;
        // arr[3] = 43;
        // arr[4] = 87;
        int[] arr = { 23, 34, 5, 4, 32 };

        // array traversal
        int index = 0;
        while (index < arr.length) {
            System.out.println(arr[index]);
            index++;
        }
        String[] strarr = new String[4];
        strarr[0] = "my string";

        String[] newString = { "first", "second", "third" };
        System.out.println("\n" + newString.length);
    }
}