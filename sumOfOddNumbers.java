public class sumOfOddNumbers {
    public static void main(String[] args) {
        int num = 100;
        int sum = oddsum(num);
        System.out.println("oddsum till" + num + "is: " + sum);
    }

    // method
    public static int oddsum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;

        }
        return sum;
    }
}
