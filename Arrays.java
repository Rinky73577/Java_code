public class Arrays{
    public static void main(String[] args) {
        // array declaration
        int a[] = new int[4]; // using new keyword
        System.out.println(a[0]);
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        System.out.println("Array Size: " + a.length);
        System.out.println("Accessing particular value from array: ");
        System.out.println(a[0]);
        System.out.println("Accessing all the value from array:");
    }
}