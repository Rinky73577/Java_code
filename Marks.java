public class Marks{
    public static void main(String[]args){
        int phy = 65;
        int chem = 78;
        int math = 68;
        int optional = 89;

        if(phy<35 || math<35 || chem<35 || optional<35)
        {
            if(phy<35){
                System.out.println("Fail-Phy: " + phy);
            }
            if(math<35){
                System.out.println("Fail-Math: " + math);
            }
            if(chem<35){
                System.out.println("Fail-chem: " + chem);
            }
            if(optional<35){
                System.out.println("Fail-optional: " + optional);
            }
        }else{
            double totalMarks = phy + chem + math + optional;
            double percentage = totalMarks/4.0;
                System.out.println(percentage + "%");

            if(percentage >= 80 ){
                System.out.println("Distinction Class");
            }else if(percentage >= 60){
                System.out.println("First-Class");
            }else{
                System.out.println("Second Class");
            }
        }
    }
}