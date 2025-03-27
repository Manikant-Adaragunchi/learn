import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Print a welcome message
        System.out.println("Hello, World!");
        
        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Print a personalized greeting
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
        
        // Close the scanner
        scanner.close();
    }
}
