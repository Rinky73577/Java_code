public class PizzaDetails {

    public static void main(String[] args) {
        Pizza p1 = new Pizza(true);
        Pizza p2 = new Pizza(true,"mashroom");
        Pizza p3 = new Pizza(false,"mashroom","onion");
        p1.bill();
        p2.bill();
        p3.bill();
    }
}