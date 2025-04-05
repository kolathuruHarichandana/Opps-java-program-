import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class V {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter visitor name: ");
        String name = scanner.nextLine();
        try {
            FileWriter fw = new FileWriter("visitors.txt", true); // append mode
            fw.write(name + "\n");
            fw.close();
            System.out.println("Visitor logged successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while logging the visitor.");
        }
        scanner.close();
    }
}
