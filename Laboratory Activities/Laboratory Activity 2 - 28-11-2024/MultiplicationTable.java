import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the maximum number for the multiplication table
        System.out.print("Enter the maximum number for the multiplication table: ");
        int maxNumber = scanner.nextInt();

        // Declare a two-dimensional array
        int[][] multiplicationTable = new int[maxNumber + 1][maxNumber + 1];

        // Populate the array with multiplication results
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                multiplicationTable[i][j] = i * j;
            }
        }

        // Print the multiplication table
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                System.out.printf("%4d", multiplicationTable[i][j]);
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner
        scanner.close();
    }
}