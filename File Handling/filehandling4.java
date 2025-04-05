import java.io.FileWriter;
import java.util.Scanner;
public class P {
    public static void main(String[] args) Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String product = scanner.nextLine();
        System.out.print("Enter your rating (1-5): ");
        int rating = scanner.nextInt();
        FileWriter fw = new FileWriter("ratings.txt", true);
        fw.write(product + " - " + rating + " stars\n");
        fw.close();
        System.out.println("Thank you! Your rating has been saved.");
        scanner.close();
    }
}
