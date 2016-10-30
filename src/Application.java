import java.util.Scanner;

public class Application {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        new Application().run();
    }

    void run() {

        System.out.println("Podaj wyraz do enkrypcji");
        String usersText = scanner.nextLine();
        EncryptDecrypt encDec = new EncryptDecrypt(usersText);





        System.out.println("Twoje slowo: " + usersText);
        System.out.println("Zakodowane slowo: " + encDec.getEncryptedWord());
        System.out.println("Odkodoowane slowo: " + encDec.getDecryptedWord());
    }




}
