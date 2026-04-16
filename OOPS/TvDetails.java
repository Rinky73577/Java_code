class TvDetails{
    public static void main(String[] args){
        Tv t1 = new Tv();
        t1.name="Sony"; t1.type="lcd"; t1.price=2300;
        System.out.println(t1.name + t1.type + t1.price);

        Tv t2 = new Tv();
        t2.name="Mi"; t2.price=2400;
        System.out.println(t2.name + t2.type + t2.price);
        
        Tv t3 = new Tv();
        t3.name="OnePlus"; t3.price=23000;
        System.out.println(t3.name + t3.type + t3.price);
    }
}