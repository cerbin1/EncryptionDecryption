class EncryptDecrypt {
    EncryptDecrypt(String usersText) {
        charactersNumbers = new int[characters.length];
        setCharactersNumber();
        this.usersText = usersText;
        encryptedWord = "";
        decryptedWord = "";
        encryptWord();
        decryptWord();
    }

    private char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'w', 'y', 'z'};
    private int[] charactersNumbers;

    private String encryptedWord;
    private String decryptedWord;
    private String usersText;


    private void setCharactersNumber() {
        for (int i = 0; i < charactersNumbers.length; i++) {
            charactersNumbers[i] = 32 + i;
        }
    }

    private void encryptWord() {
        for (int i = 0; i < usersText.length(); i++) {
            int number = getLettersNumber(usersText.charAt(i));
            encryptedWord += (char) number;
        }
    }

    private int getLettersNumber(char character) {
        for (int i = 0; i < characters.length; i++) {
            if (character == characters[i]) {
                return charactersNumbers[i];
            }
        }
        System.out.println("cos sie popsulo");
        return 0;
    }

    private void decryptWord() {
        for (int i = 0; i < usersText.length(); i++) {
            int number = (int) encryptedWord.charAt(i);
            System.out.println(number);
            char character = decryptCharacter(number);
            decryptedWord += character;
        }
    }

    private char decryptCharacter(int number) {
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
