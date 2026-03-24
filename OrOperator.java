public class OrOperator
{
    public static void main(String[]args)
    {
        int day = 7;
        if (day == 1 || day == 7)
        {
            System.out.println("Weekend");
        }
        else if (day==2 || day==3 || day == 4 || day == 5 || day == 6)
        {
            System.out.println("weekday");
        }else 
        {
            System.out.println("Invalid Input");
        }
    }
}