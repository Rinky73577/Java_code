/* public class Withdraw {

    public static void main(String[] args) {
        int balance = 5000;
        int amt = 2300;

        System.out.println("Amount Before Withdraw: " + balance);

        System.out.println("Amount to Withdraw: " + amt);

        balance = balance - amt;

        System.out.println("Total Balance: " + balance);
    }
} */


//Simple if 

public class Withdraw {

    public static void main(String[] args) {
        int balance = 5000;
        int amt = 2300;

        System.out.println("Amount Before Withdraw: " + balance);

        System.out.println("Amount to Withdraw: " + amt);

        if (amt <= balance)
        {
            balance = balance - amt;
            System.out.println("Transaction successful");
        }
        
        System.out.println("Total Balance: " + balance);
    }
}