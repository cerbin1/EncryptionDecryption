import java.util.Scanner;

public class Application {

    private static Scanner scanner = new Scanner(System.in);
    String usersWord;


    public static void main(String[] args) {
        new Application().run();
    }

    void run() {


        String usersText = scanner.nextLine();

        for (int i = 0; i < usersText.length(); i++) {
            int number = getLettersNumber(usersText.charAt(i));
            encryptedWord += (char) number;
        }

        for (int i = 0; i < usersText.length(); i++) {
            int number = (int) encryptedWord.charAt(i);
            System.out.println(number);
            char character = decryptCharacter(number);
            decryptedWord += character;
        }


        System.out.println("Twoje slowo: " + usersText);
        System.out.println("Zakodowane slowo: " + encryptedWord);
        System.out.println("Odkodoowane slowo: " + decryptedWord);
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

    char decryptCharacter(int number) {
        for (int i = 0; i < characters.length; i++) {
            if (number == charactersNumbers[i]) {
                return characters[i];
            }
        }
        System.out.println("cos sie popsulo");
        return 'g';
    }
}
