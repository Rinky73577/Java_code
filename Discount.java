public class Discount {

    public static void main(String[] args) {
        int p1 = 300;
        int p2 = 500;
        int p3 = 600;
        int p4 = 500;

        int total = p1 + p2 + p3 + p4;

        float discount = (10.0f/100.0f) * total;

        float grandtotal = 0.0f;

        if(total >= 2000)
        {
            discount = (20.0f/100.0f) * total;
        }
        grandtotal = total - discount;

        System.out.println("Total " + total);
        System.out.println("Discount " + discount);
        System.out.println("Grandtotal " + grandtotal);
    }
}