class EncryptDecrypt {
    EncryptDecrypt(String usersText) {
        codedCharactersNumbers = new int[characters.length];
        setCodedCharactersNumbers();
        this.usersText = usersText;
        encryptedWord = "";
        decryptedWord = "";
        encryptWord();
        decryptWord();
    }

    private char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'w', 'y', 'z'};
    private int[] codedCharactersNumbers;

    private String encryptedWord;
    private String decryptedWord;
    private String usersText;

    private void setCodedCharactersNumbers() {
        for (int i = 0; i < codedCharactersNumbers.length; i++) {
            codedCharactersNumbers[i] = 32 + i;
        }
    }

    private void encryptWord() {
        for (int i = 0; i < usersText.length(); i++) {
            int number = getCodedCharacterNumber(usersText.charAt(i));
            encryptedWord += (char) number;
        }
    }

    private int getCodedCharacterNumber(char character) {
        for (int i = 0; i < characters.length; i++) {
            if (character == characters[i]) {
                return codedCharactersNumbers[i];
            }
            if((int)character == 32) {
                return '_';
            }
        }
        return 120;
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
            if (number == codedCharactersNumbers[i]) {
                return characters[i];
            }
            if(number == 95) {
                return '_';
            }
        }
        return 'X';
    }

    String getEncryptedWord() {
        return encryptedWord;
    }

    String getDecryptedWord() {
        return decryptedWord;
    }
}
