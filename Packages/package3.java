Package company.hr;
public class Employee {
private String name;
private double baseSalary;
private int hoursWorked;
public Employee(String name, double baseSalary, int hoursWorked) {
this.name = name;
this.baseSalary = baseSalary;
this.hoursWorked = hoursWorked;
}
public String getName() {
return name;
}
public double getBaseSalary() {
return baseSalary;
}
public int getHoursWorked() {
return hoursWorked;
}
}
Package code:
package company.finance;
import company.hr.Employee;


public class Payroll {
public double calculateSalary(Employee employee) {
double baseSalary = employee.getBaseSalary();
int hoursWorked = employee.getHoursWorked();
double hourlyRate = baseSalary / 160; // Assuming 160 working hours in
a month
return hourlyRate * hoursWorked;
}
}
Main Code:
import company.hr.Employee;
import company.finance.Payroll;
public class Main {
public static void main(String[] args) {
Employee employee = new Employee("mahi", 4000.0, 160);
Payroll payroll = new Payroll();
double salary = payroll.calculateSalary(employee);
System.out.println("Salary of " + employee.getName() + " is: $" +
salary);}
}
