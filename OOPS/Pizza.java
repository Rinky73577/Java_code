public class Pizza {

    final String type = "Regular";
    double price = 100;
    Boolean cheezebrust;
    String topping1;
    String topping2; 

    Pizza(boolean cheezebrust){
        this.cheezebrust = cheezebrust;
        if(cheezebrust==true){
            price=price+80;
        }
    }

    Pizza(boolean cheezebrust, String topping1){
        this.cheezebrust = cheezebrust;
        this.topping1 = topping1;
        price=price+40;
        if(cheezebrust==true){
            price=price+80;
        }
    }
    Pizza(boolean cheezebrust, String topping1, String topping2){
        this.cheezebrust = cheezebrust;
        this.topping1 = topping1;
        this.topping2 = topping2;
        price=price+70;
        if(cheezebrust==true){
            price=price+80;
        }
    }
    double gst(){
        double gst = (price*8/100.0);
        return gst+price;
    }
    void bill(){
        System.out.println(cheezebrust);
        System.out.println(topping1);
        System.out.println(topping2);
        System.out.println("Total Price: " + gst());
    }
}