public class EncrypterDecrypter {
    public EncrypterDecrypter() {
        charactersNumbers = new int[characters.length];
        setCharactersNumber();
    }

    char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'w', 'y', 'z'};
    int[] charactersNumbers;

    String encryptedWord = "";
    String decryptedWord = "";


    void setCharactersNumber() {
        for (int i = 0; i < charactersNumbers.length; i++) {
            charactersNumbers[i] = 32 + i;
        }
    }
}