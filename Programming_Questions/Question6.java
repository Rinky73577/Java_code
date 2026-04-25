//WAP to print all the factors or divisiors for the given number 

public class Question6 {

    public static void main(String[] args) {
        int num = 12;
        for(int i=1; i<=num; i++){
            if(num%i==0){                
                System.out.println(i);   
            }
        }
    }
}