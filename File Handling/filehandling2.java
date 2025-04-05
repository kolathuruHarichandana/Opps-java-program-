import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class T{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("tasks.txt");
        Scanner scanner = new Scanner(file);
        System.out.println("Today's Tasks:");
        while (scanner.hasNextLine()) {
            System.out.println("- " + scanner.nextLine());
        }
        scanner.close();
    }
}
