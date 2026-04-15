public class BiggestNo {
    public static void main(String[] args) {
//         int a = 20; int b=34; int c=211;

//         if ((a>b) && (b>c)){
//             System.out.println("A is biggest No:" + a);
//         }
//         else if((b>c) && (c>a)){
//             System.out.println("B is biggest No:" + b);
//         }else {
//             System.out.println("C is biggest No:" + c);
//         }
//     }
// }

// OR 

    int a = 20; int b=34; int c=211;
    int big = a;
    if(b>big)
    big = b;
    if(c>big)
    big= c;
    System.out.println("Biggest No is: " + big);
    }
}