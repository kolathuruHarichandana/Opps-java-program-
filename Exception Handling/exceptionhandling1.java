       import java.util.Scanner;

           class InvalidOptionException extends Exception   {
    public InvalidOptionException(String message) {
       super(message);
     }
}
public class OnlineExam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] options = {"A", "B", "C", "D"};
        try {
            System.out.println("Q: What is the capital of France?");
            System.out.println("A) Berlin\nB) Madrid\nC) Paris\nD) Rome");
            System.out.print("Enter your option (A/B/C/D): ");
            String input = scanner.next().toUpperCase();
                            boolean isValid = false;
            for (String opt : options) {
                if (opt.equals(input)) {
                    isValid = true;
                    break;
                }
            }

            if (!isValid) {
                throw new InvalidOptionException("You selected an invalid option: " + input);
            }
            if (input.equals("C")) {
                System.out.println("Correct Answer!");
            } else {
                System.out.println("Wrong Answer.");
            }

        } catch (InvalidOptionException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        } }
