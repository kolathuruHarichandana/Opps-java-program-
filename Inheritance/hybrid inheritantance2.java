class Person {
    String name = "Dr. Neha Singh";
    void showPerson() {
        System.out.println("Name: " + name);
    }
}
interface Teachable {
    void teach();
}
interface Schedulable {
    void scheduleClass();
}
class Professor extends Person implements Teachable, Schedulable {
    public void teach() {
        System.out.println("Teaching Data Structures.");
    }
    public void scheduleClass() {
        System.out.println("Class scheduled at 10:00 AM.");
    }
}
public class F {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.showPerson();
        p.teach();
        p.scheduleClass();
    }
}
