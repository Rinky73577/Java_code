public class LaptopDetails{
    public static void main(String[] args){
       Laptop l1 = new Laptop();
       l1.brand="dell"; l1.name="inspiron"; l1.processor="i3"; l1.price=200000;
       System.out.println(l1.brand + l1.name + l1.processor + l1.price);

       Laptop l2 = new Laptop();
       l2.brand="hp"; l2.name="inspiron"; l2.price=240000;
       System.out.println(l2.brand + l2.name + l2.processor + l2.price);

       Laptop l3 = new Laptop();
       l3.brand  = "apple"; l3.name="mac-book"; l3.price=123000;
       System.out.println(l3.brand + l3.name + l3.processor + l3.price);
    }
}