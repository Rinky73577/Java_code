public class Percentage {

    public static void main(String[] args) {
        int phy = 54;
        int math = 87;
        int chem = 76;
        int optional = 67;

        int sum = phy + math + chem + optional;

        double average = (sum / 400.0) * 100;

        System.out.println("Average of all subject: " + average);

    }
}