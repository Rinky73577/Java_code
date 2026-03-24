public class withdraw2{
    public static void main(String[]args){
        int bal = 75000;
        int amt = 70000;
        int bankCode = 3;
        boolean panCard = true;

        if(amt<=bal){
            if(amt<50000 || panCard==true){
                bal=bal-amt;
                System.out.println("Transaction Successful");
                if(bankCode==1 || bankCode==2){
                    if(bal<10000){
                        System.out.println("Low Minimum balance");
                        System.out.println(10000-bal + " Must be Deposite");
                    }
            }else if(bankCode==4){
                if(bal<5000){
                    System.out.println("Low Minimum balance");
                    System.out.println(5000-bal + " Must be Deposite");
                }
            }
        }else{
            System.out.println("Link panCard");
            }
        }else{
            System.out.println("Insuffecent Amount");
        }
    }
}