class Tv1Details{
    public static void main(String[] args) {
        Tv1 t1 = new Tv1("Sony", "lcd",34);
        System.out.println(t1.name + t1.type + t1.price);

        Tv1 t2 = new Tv1("Mi", "led",35);
        System.out.println(t2.name + t2.type + t2.price);

        Tv1 t3 = new Tv1("onePlus", "led",54);
        System.out.println(t3.name + t3.type + t3.price);
    }
}