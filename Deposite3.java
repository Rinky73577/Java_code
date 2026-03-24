public class Deposite3 {

    public static void main(String[] args) {
        int bal = 75000;
        int amt = 5000;

        boolean panCard = true;

        if(amt<50000 || panCard == true){
            bal=bal+amt;
            System.out.println("Transaction Sucessfull");
        }else{
            System.out.println("Link panCard");
        }
    }
}