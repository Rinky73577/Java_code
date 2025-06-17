import java.util.Scanner;

public class sum_AvgOfArr {

    public static void main(String[] args) {
        int[] numArray = arrayUtility.inputArray();
        long sum = sum(numArray);
        System.out.println(sum);
        long avg = avg(numArray);
        System.out.println(avg);
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static long avg(int[] numArray) {
        long sum = sum(numArray);

        return (int) (sum / numArray.length);
    }
}