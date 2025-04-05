import java.util.Scanner;
interface SmartDevice {
    void turnOn();
    void turnOff();
}
class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Light is turned ON.");
    }
    public void turnOff() {
        System.out.println("Smart Light is turned OFF.");
    }
}
class SmartFan implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Fan is turned ON.");
    }
    public void turnOff() {
        System.out.println("Smart Fan is turned OFF.");
    }
}
public class S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Device: 1. Smart Light  2. Smart Fan");
        int choice = scanner.nextInt();
        SmartDevice device;
        if (choice == 1) {
            device = new SmartLight();
        } else {
            device = new SmartFan();
        }
        device.turnOn();
        device.turnOff();
        scanner.close(); 
    }
}
