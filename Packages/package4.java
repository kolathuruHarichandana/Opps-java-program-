package code:
package exceptions;
public class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
 super(message);
 }
}
Package code:
package validation;
import exceptions.InvalidAgeException;

public class AgeValidator {
 public void validateAge(int age) throws InvalidAgeException {
 if (age < 18) {
 throw new InvalidAgeException("Age must be 18 or above.");
 }
 System.out.println("Age is valid.");
 }
}
Main code:
import validation.AgeValidator;
import exceptions.InvalidAgeException;
public class Main {
 public static void main(String[] args) {
 AgeValidator validator = new AgeValidator();
 try {
 validator.validateAge(15); // This will throw an exception
 } catch (InvalidAgeException e) {
 System.out.println("Error: " + e.getMessage());
} try { validator.validateAge(20); 
} catch (InvalidAgeException e) { System.out.println("Error: " + e.getMessage()); 
}
 } 
