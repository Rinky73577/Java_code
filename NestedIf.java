public class NestedIf {

    private static final Boolean Fales = null;
    private static final Boolean True = null;

    public static void main(String[] args) {
        int age = 12; 
        Boolean voterID = Fales;

        if(age>= 18)
        {
            if(voterID==True){
                System.out.println("Eligible to vote");
            }else{
                System.out.println("No VoterID");
            }
        }else{
            System.out.println("No Eligible");
        }
    }
}