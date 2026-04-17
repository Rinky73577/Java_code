public class Student1 {

    String name; String qualification; int yof; String email;

    Student1(String name, String qualification, int yof, String email){
        this.name=name;
        this.qualification=qualification;
        this.yof=yof;
        this.email=email;
    }
        Student1(String name, String qualification, int yof){
        this.name=name;
        this.qualification=qualification;
        this.yof=yof;
    }
    void display(){
        System.out.println(name);
        System.out.println(qualification);
        System.out.println(yof);
        System.out.println(email);
    }
}