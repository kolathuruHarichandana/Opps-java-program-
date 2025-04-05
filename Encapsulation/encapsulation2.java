class Employee {
    private int workHours;
    private double salary;
    private final double PAY_RATE = 500;    
 public int getWorkHours() {
        return workHours;
    }
    public double getSalary() {
        return salary;
    }
    public void addWorkHours(int hours) {
        this.workHours += hours;
        this.salary = this.workHours * PAY_RATE;
    }
}
public class E{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.addWorkHours(8); 
        System.out.println("Total Work Hours: " + emp.getWorkHours());
        System.out.println("Total Salary: Rs. " + emp.getSalary());
    }
}
