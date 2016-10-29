import java.util.Scanner;

public class Application {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String usersText = scanner.nextLine();
        String newWord = "";
        for (int i = 0; i < usersText.length(); i++) {
            newWord += 'X';
        }
        System.out.println("Twoje slowo: " + usersText);
        System.out.println("Zakodowane slowo: " + newWord);

    }
}
