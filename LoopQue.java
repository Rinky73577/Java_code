public class LoopQue{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        //Forward Direction
        System.out.println("Forward Direction: ");
        for(int i=0; i<=a.length-1; i=i+1){
            System.out.println(a[i]);
        }

        //Backward Direction
        System.out.println("Backward Direction: ");
        for(int i=a.length-1; i>=0; i=i-1){
            System.out.println(a[i]);
        }

        //Except first 2 & last 2
        System.out.println("Except first 2 & last 2: ");
        for(int i=2; i<=7; i=i+1){
            System.out.println(a[i]);
        }

        //Except last 3
        System.out.println("Except last 3: ");
        for(int i=0; i<=6; i=i+1){
            System.out.println(a[i]);
        }

        //Except first 3 & last 2
        System.out.println("Except first 3 & last 2: ");
        for(int i=3; i<=7; i=i+1){
            System.out.println(a[i]);
        }

        //Sum
        System.out.println("SUM: ");
        int sum = 0;
        for(int i=0; i<=a.length-1; i=i+1){
            sum = sum + a[i];
        }System.out.println(sum);

        //Product
        System.out.println("Product: ");
        int product = 1;
        for(int i=0; i<=a.length-1; i=i+1){
            product = product * a[i];
        }System.out.println(product);

        //even
        System.out.println("Even: ");
        for(int i=0; i<=a.length-1; i=i+1){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }

        //Odd
        System.out.println("Odd: ");
        for(int i=0; i<=a.length-1; i=i+1){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }

        //First Half of an array
        System.out.println("First Half of an array: ");
        for(int i=0; i<a.length/2; i= i+1){
            System.out.println(a[i]);
        }

        //Last Half of an array
        System.out.println("Last Half of an array: ");
        for(int i=5; i<=a.length-1; i= i+1){
            System.out.println(a[i]);
        }
    }
}