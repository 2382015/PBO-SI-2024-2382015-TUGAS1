import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata dalam format camelcase: ");
        String camelcase = input.nextLine();

        // Inisialisasi jumlah kata dengan 1, karena kata pertama selalu diawali dengan huruf kecil
        int wordCount = 1;

        // Ubah string menjadi array karakter
        char[] characters = camelcase.toCharArray();

        // Loop foreach untuk iterasi melalui array karakter
        for (char c : characters) {
            // Cek jika karakter saat ini adalah huruf kapital
            if (Character.isUpperCase(c)) {
                // Jika huruf kapital, tambahkan 1 ke jumlah kata
                wordCount++;
            }
        }

        // Cetak jumlah kata
        System.out.println("jumlah kata dalam format camelCase: " + wordCount);

        // Tutup scanner
        input.close();
    }
}
