import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first character: ");
        char ch1 = scanner.next().charAt(0); 

        System.out.print("Enter second character: ");
        char ch2 = scanner.next().charAt(0);  

        int ascii1 = (int) ch1;
        int ascii2 = (int) ch2;
        
        char greaterChar = (char) Math.max(ascii1, ascii2);
        
        System.out.println("Greater character: " + greaterChar);
        System.out.println("ASCII code of first character (" + ch1 + "): " + ascii1);
        System.out.println("ASCII code of second character (" + ch2 + "): " + ascii2);

        scanner.close();
    }
}
