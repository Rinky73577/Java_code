import java.util.Scanner;

public class occurrencesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = 45;
        int[] numArr = arrayUtility.inputArray();
        System.out.println("enter the number you want to find: ");
        int num = sc.nextInt();
        int occurrences = noOfOccurrences(numArr, num);
        System.out.println("your element was found: " + occurrences);

    }

    public static int noOfOccurrences(int[] numArr, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArr.length) {
            if (numArr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
