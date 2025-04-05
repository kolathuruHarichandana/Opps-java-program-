import java.util.Scanner;
class Employee {
    private String name;
    private int availableLeaves;
    private int totalLeaves;
    private int usedLeaves;
    public Employee(String name, int totalLeaves) {
        this.name = name;
        this.totalLeaves = totalLeaves;
        this.availableLeaves = totalLeaves;  // Initially, all leaves are available
        this.usedLeaves = 0;
    }
    public void requestLeave(int days) {
        if (days <= availableLeaves && days > 0) {
            availableLeaves -= days;
            usedLeaves += days;
            System.out.println(name + " has requested " + days + " days off.");
        } else {
            System.out.println("Insufficient leave balance or invalid number of days.");
        }
    }
    public void cancelLeave(int days) {
        if (days <= usedLeaves && days > 0) {
            availableLeaves += days;
            usedLeaves -= days;
            System.out.println(name + " has canceled " + days + " days of leave.");
        } else {
            System.out.println("Invalid number of days to cancel.");
        }
    }
    public void checkLeaveBalance() {
        System.out.println(name + " has " + availableLeaves + " leave days remaining.");
    }
    public String getName() {
        return name;
    }

    public int getUsedLeaves() {
        return usedLeaves;
    }
}
public class L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp1 = new Employee("John Doe", 20);  // 20 total leaves
            while (true) {
            System.out.println("\n--- Leave Management Menu ---");
            System.out.println("1. Check Leave Balance");
            System.out.println("2. Request Leave");
            System.out.println("3. Cancel Leave");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    emp1.checkLeaveBalance();
                    break;
                case 2:
                    System.out.print("Enter number of leave days: ");
                    int leaveDays = scanner.nextInt();
                    emp1.requestLeave(leaveDays);
                    break;
                case 3:
                    System.out.print("Enter number of leave days to cancel: ");
                    leaveDays = scanner.nextInt();
                    emp1.cancelLeave(leaveDays);
                    break;
                case 4:
                    System.out.println("Exiting Leave Management System");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
