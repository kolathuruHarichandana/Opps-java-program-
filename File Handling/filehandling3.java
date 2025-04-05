import java.io.*;
import java.util.Scanner;

public class F {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your feedback: ");
        String feedback = scanner.nextLine();

        FileWriter fw = new FileWriter("feedback.txt", true);
        fw.write(feedback + "\n");
        fw.close();
        System.out.println("Feedback submitted.");

        System.out.println("\nAll Feedbacks:");
        BufferedReader br = new BufferedReader(new FileReader("feedback.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println("- " + line);
        }
        br.close();

        scanner.close();
    }
}
