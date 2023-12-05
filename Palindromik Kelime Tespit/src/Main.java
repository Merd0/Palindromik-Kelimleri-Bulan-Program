import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kullanıcıdan kelimeyi al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();
        scanner.close();

        // Küçük harfe çevir
        kelime = kelime.toLowerCase();

        // Palindrom kontrolü
        boolean palindrom = true;
        for (int i = 0, j = kelime.length() - 1; i < j; i++, j--) {
            if (kelime.charAt(i) != kelime.charAt(j)) {
                palindrom = false;
                break;
            }
        }

        // Sonucu ekrana yazdır
        if (palindrom) {
            System.out.println(kelime + " bir palindromdur.");
        } else {
            System.out.println(kelime + " bir palindrom değildir.");
        }
    }
}
