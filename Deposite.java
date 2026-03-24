public class Deposite {

    public static void main(String[] args) {
        int balance = 5000;
        int amt = 3000;

        System.out.println("Amount Before deposite: " + balance);

        System.out.println("Amount to deposite: " + amt);

        balance = balance + amt;

        System.out.println("Total Balance: " + balance);
    }
}