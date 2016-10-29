import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static Scanner scanner = new Scanner(System.in);

    List<Character> randomNumbers = new ArrayList<>();
    Character[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'w', 'y', 'z'};
    int[] charactersNumbers = new int[characters.length];
    String encryptedWord = "";

    public static void main(String[] args) {
        new Application().run();
    }

    void run() {

        for (int i = 0; i < charactersNumbers.length; i++) {
            charactersNumbers[i] = (int) (Math.round(Math.random() * 127));
        }

        String usersText = scanner.nextLine();
        for (int i = 0; i < usersText.length(); i++) {
            int number = getLettersNumber(usersText.charAt(i));
            encryptedWord += (char) number;
        }

        randomNumbers.forEach(System.out::println);

        System.out.println("Twoje slowo: " + usersText);
        System.out.println("Zakodowane slowo: " + encryptedWord);
    }

    int getLettersNumber(char character) {
        for (int i = 0; i < characters.length; i++) {
            if (character == characters[i]) {
                return charactersNumbers[i];
            }
        }
        System.out.println("cos sie popsulo");
            return 0;
    }

}
