import java.util.Scanner;

public class arrayUtility {
    public static int[] inputArray(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your array: ");
        int arr = sc.nextInt();
        int[] nums = new int[arr];
        int i = 0;
        while (i< arr){
            System.out.println("Enter array number: " +(i+1));
            nums[i] = sc.nextInt();
            i++;

        }
        return nums;
    }
    
}
