public class Pattern22 {

    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=2*i-1; k++){
                if(i%2==0){
                System.out.print((char)(96+k)+" ");}
                else{
                    System.out.print((char)(64+k)+" ");}
            }
            System.out.println();
        }

        int m = 5;
        int space=m-1;
        int star = 1;

        for(int i=1; i<=m; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++){
                if(i%2==0){
                    System.out.print((char)(96+k)+" ");
                }else{
                    System.out.print((char)(64+k)+" ");
                }
            }
            System.out.println();
            space--;star=star+2;
        }
    }
}

//         A 
//       a b c 
//     A B C D E 
//   a b c d e f g 
// A B C D E F G H I 