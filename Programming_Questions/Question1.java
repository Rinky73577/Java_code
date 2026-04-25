//1. WAP to find the biggest number among 3 numbers using if statement only
public class Question1 {
    public static void main(String[] args) {
 
    int a=10; 
    int b=20;
    int c=48;
    int biggest=a;

    if(b>biggest){
        biggest=b;
    }
    if(c>biggest){
        biggest=c;
    }
       System.out.println(biggest);    
    }
    
}



// public class Question1 {
//     public static void main(String[] args) {        
//         int n=5;
//         int f1=0;
//         int f2=1;
//         int sum=0;
//         System.out.print(f1+" "+f2+" ");
//         for(int i=0; i<=n; i++){ 
//             sum=f1+f2;
//             f1=f2;
//             f2=sum;
//             System.out.print(sum+" ");
            
//         }
        
//     }
// }
