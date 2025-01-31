# Opps-java-program-
Basics java program 
Java Basics Programs
 
Example 1: To Calculate Factorial Number 
Code :
class Test { 
    static int factorial(int n) 
    { 
        int res = 1, i; 
        for (i = 2; i <= n; i++) 
            res *= i; 
        return res; 
    } 
  
       public static void main(String[] args) 
    { 
        int num = 5; 
        System.out.println("Factorial of " + num + " is "
                           + factorial(5)); 
    } 
}
OUTPUT:
p
Factorial of 5 is 120
![image](https://github.com/user-attachments/assets/8d99936d-c4e0-4189-8907-3091395b370f)

 
Example 2: To find palindrome Number 
Code :
class Main {
  public static void main(String[] args) {
    
    int num = 3553, reversedNum = 0, remainder;
    
       int originalNum = num;
    
        while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }
}
OUTPUT:
3535 is a palindrome
![image](https://github.com/user-attachments/assets/3ac80557-df6a-4aa1-879a-6ffd06b1d0ea)


Example 3: Simple java Program to find Grade of Students 
Code:
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter marks
        System.out.println("Enter the marks of the student:");
        int marks = scanner.nextInt();


        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

       
        System.out.println("The grade of the student is: " + grade);

      
        scanner.close();
    }
}
OUTPUT:
![image](https://github.com/user-attachments/assets/1ec19fe4-3b54-4ee0-a1c1-f63e1883e7ac)


Example 4:A Simple Java Program to Convert Distance
Code:
import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1: Kilometers to Miles");
        System.out.println("2: Miles to Kilometers");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter distance in kilometers: ");
            double kilometers = scanner.nextDouble();
            double miles = kilometers * 0.621371;
            System.out.println(kilometers + " km = " + miles + " miles");
        } else if (choice == 2) {
            System.out.print("Enter distance in miles: ");
            double miles = scanner.nextDouble();
            double kilometers = miles / 0.621371;
            System.out.println(miles + " miles = " + kilometers + " km");
        } else {
            System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
}
OUTPUT:
![image](https://github.com/user-attachments/assets/52162003-70d8-4773-ac43-1fcec4a57d3f)

Example 5: A Simple Java Program to Provide electricity bill Based on their Power consumption
Code: 
import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of units consumed
        System.out.println("Enter the number of units consumed:");
        int units = scanner.nextInt();

        double billAmount;

        // Calculate the bill amount based on the unit slab
        if (units <= 100) {
            billAmount = units * 1.50;  // Rate: ₹1.50 per unit
        } else if (units <= 200) {
            billAmount = 100 * 1.50 + (units - 100) * 2.50;  // ₹2.50 for units above 100
        } else if (units <= 300) {
            billAmount = 100 * 1.50 + 100 * 2.50 + (units - 200) * 3.50;  // ₹3.50 for units above 200
        } else {
            billAmount = 100 * 1.50 + 100 * 2.50 + 100 * 3.50 + (units - 300) * 5.00;  // ₹5.00 for units above 300
        }

        // Display the total bill amount
        System.out.println("Electricity Bill:");
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill Amount: ₹" + billAmount);
    scanner.close();
    }
}
OUTPUT:
![image](https://github.com/user-attachments/assets/92e2472c-d5dd-447b-bdfb-2bda12dc68c7)


