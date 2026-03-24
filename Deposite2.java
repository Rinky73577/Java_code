public class Deposite2{

    public static void main(String[] args) {
        int bal = 75000;
        int amt = 65000;

        Boolean panCard = false;

        if(amt>=50000){
            if(panCard==true){
                System.out.println("Transaction Sucassful");
            }else{
                System.out.println("Link panCard");
            }
        }else{
            System.out.println("Transaction Sucassful");
        }
    }
}