class Laptop1Details{
    public static void main(String[] args) {
       Laptop1 l1 = new Laptop1("Dell", "inspiron", "i3",10 );
       System.out.println(l1.brand + l1.name + l1.processor + l1.price); 

       Laptop1 l2 = new Laptop1("hp", "Pavilion", "i7",67 );
       System.out.println(l2.brand + l2.name + l2.processor + l2.price); 

       Laptop1 l3 = new Laptop1("apple", "mac-book", "i7", 98 );
       System.out.println(l3.brand + l3.name + l3.processor + l3.price); 
    }
}