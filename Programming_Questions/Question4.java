//4. write a program to print all the even number present between 1 to 100

public class Question4 {

    public static void main(String[] args) {
        int n=100;
        for(int i=1; i<=n; i++){
            if(i%2==0){  
            System.out.println(i);
            }
        }
    }
}