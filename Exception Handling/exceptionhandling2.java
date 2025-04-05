import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FH {
    public static void main(String[] args) {
        try {
            File file = new File("FH.java");
            Scanner scanner = new Scanner(file); // may throw FileNotFoundException
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file name or path.");
        }
    }
}
