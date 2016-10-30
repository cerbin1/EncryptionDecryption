public class EncryptDecrypt {
    public EncryptDecrypt(String usersText) {
        charactersNumbers = new int[characters.length];
        setCharactersNumber();
        this.usersText = usersText;
        encryptedWord = "";
        decryptedWord = "";
        encryptWord();
        decrypeWord();
    }

    char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'w', 'y', 'z'};
    int[] charactersNumbers;

    String encryptedWord;
    String decryptedWord;
    String usersText;


    void setCharactersNumber() {
        for (int i = 0; i < charactersNumbers.length; i++) {
            charactersNumbers[i] = 32 + i;
        }
    }

    void encryptWord() {
        for (int i = 0; i < usersText.length(); i++) {
            int number = getLettersNumber(usersText.charAt(i));
            encryptedWord += (char) number;
        }
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

    void decrypeWord() {
        for (int i = 0; i < usersText.length(); i++) {
            int number = (int) encryptedWord.charAt(i);
            System.out.println(number);
            char character = decryptCharacter(number);
            decryptedWord += character;
        }
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

    String getEncryptedWord() {
        return encryptedWord;
    }

    String getDecryptedWord() {
        return decryptedWord;
    }
}
