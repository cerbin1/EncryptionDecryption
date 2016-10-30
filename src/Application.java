import java.util.Scanner;

public class Application {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        System.out.println("Podaj wyraz do enkrypcji");
        String usersText = scanner.nextLine();
        EncryptDecrypt encDec = new EncryptDecrypt(usersText);

        System.out.println("Twoj tekst: " + usersText);
        System.out.println("Zakodowany tekst: " + encDec.getEncryptedWord());
        System.out.println("Odkodoowany tekst: " + encDec.getDecryptedWord());
    }
}
