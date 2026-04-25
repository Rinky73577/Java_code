//3. write a program to check the given number is even or odd

public class Question3{
    public static void main(String[] args) {
        int num=2;
        if(num%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("odd number ");
        }


    //without using modulo operator
    int num1 = 7;
        if(num1/2*2==num1){
            System.out.println("Even Number");
        }else{
            System.out.println("odd number ");
        }
        
        
    //using switch statement
    int n=2;
    switch(n%2){
        case 0:
            System.out.println("Even Number");
            break;
        case 1:
            System.out.println("Odd Number");    
        }
    }
}




