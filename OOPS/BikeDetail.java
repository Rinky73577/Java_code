class BikeDetails{
    public static void main(String[] args) {
        Bike s1 = new Bike();
        s1.model="Kawasaki Z650"; s1.engin="649cc"; s1.topSpeed=210; s1.price=240000;
        System.out.println(s1.model + s1.engin + s1.topSpeed + s1.price);

        Bike s2 = new Bike();
        s2.model=" Stree Triple R"; s2.engin="765cc"; s2.topSpeed=210; s2.price=220000;
        System.out.println(s1.model + s1.engin + s1.topSpeed + s1.price);

        Bike s3 = new Bike();
        s3.model="Dugati Panigale V2"; s3.engin="955cc"; s3.topSpeed=210; s3.price=180000;
        System.out.println(s1.model + s1.engin + s1.topSpeed + s1.price);

    }
}