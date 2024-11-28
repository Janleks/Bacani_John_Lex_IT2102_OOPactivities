import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for input
        System.out.print("Enter first character: ");
        char ch1 = scanner.next().charAt(0);  // Get the first character

        System.out.print("Enter second character: ");
        char ch2 = scanner.next().charAt(0);  // Get the first character

        // Get ASCII values
        int ascii1 = (int) ch1;
        int ascii2 = (int) ch2;

        // Determine the character with the greater value
        char greaterChar = (char) Math.max(ascii1, ascii2);
        
        // Print the results
        System.out.println("Greater character: " + greaterChar);
        System.out.println("ASCII code of first character (" + ch1 + "): " + ascii1);
        System.out.println("ASCII code of second character (" + ch2 + "): " + ascii2);

        // Close the scanner
        scanner.close();
    }
}