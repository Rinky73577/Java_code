public class twoDimentionalArray {
    public static void main(String[] args) {

        int[][] arr1 = new int[2][3];
        arr1[0][0] = 9;

        int[][] arr = { { 4, 3, 4 }, { 7, 6, 5 }, { 4, 6, 2 } };
        System.out.println(arr[0].length);
        System.out.println(arr1.length);

        // traversal
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
