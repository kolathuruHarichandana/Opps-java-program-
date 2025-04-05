class Student {
    String name;
    int rollNumber;
    String course;
    Student(String studentName, int roll, String courseName) {
        name = studentName;
        rollNumber = roll;
        course = courseName;
    }
    void displayDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Course       : " + course);
    }
}
public class StudentRegistration {
    public static void main(String[] args) {
        // Creating object and passing values through constructor
        Student s1 = new Student("Riya Sharma", 101, "Computer Science");
        Student s2 = new Student("Karan Verma", 102, "Information Technology");
        s1.displayDetails();
        System.out.println("----------------------");
        s2.displayDetails();
    }
}
