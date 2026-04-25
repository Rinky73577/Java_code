//2. WAP to find the Smallest number among 3 numbers using if statement only
public class Question2 {
    public static void main(String[] args) {
 
    int a=10; 
    int b=20;
    int c=48;
    int smallest=a;

    if(b<smallest){
        smallest=b;
    }
    if(c<smallest){
        smallest=c;
    }
       System.out.println(smallest);    
    }    
}