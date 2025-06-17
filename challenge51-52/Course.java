public class Course {

    static int maxCapacity = 100;
    static int setMaxCapacity;

    int enrollments;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    String courseName;
    String[] enrolledStudents;

    // static {
    //     maxCapacity = 60;
    // }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrolledStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unEnrolledStudent(String studentName) {
        System.out.println("Student removed");
        enrollments--;
    }

    public static void main(String[] args) {
        
    }
}
