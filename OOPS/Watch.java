class Watch{
    String brand;
    String model;
    String type;
    double price;

    Watch(String b, String m, String t, double p){
        brand = b;
        model = m;
        type = t;
        price = p;
    }
    void display(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(type);
        System.out.println(price);
    }
}



