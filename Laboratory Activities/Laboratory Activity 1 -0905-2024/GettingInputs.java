import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year (Integer): ");
        int year = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter the genre (String): ");
        String genre = scanner.nextLine();

        System.out.print("Enter the album name (String): ");
        String album = scanner.nextLine();

        System.out.print("Enter the title (String): ");
        String title = scanner.nextLine();

        System.out.print("Enter the artist name (String): ");
        String artist = scanner.nextLine();

        System.out.println("\nEntered Values:");
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);

        scanner.close();
    }
}
