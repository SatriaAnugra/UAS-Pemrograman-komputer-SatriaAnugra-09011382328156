import java.util.Scanner;

public class PalindromCheck {

    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        // Memanggil metode untuk mengecek apakah kata/frase adalah palindrom
        if (isPalindrom(input)) {
            System.out.println("Ini adalah palindrom.");
        } else {
            System.out.println("Ini bukan palindrom.");
        }
        scanner.close();
    }

    // Metode untuk mengecek apakah sebuah string adalah palindrom
    private static boolean isPalindrom(String input) {
        // Menghapus spasi dan mengubah huruf menjadi huruf kecil
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Inisialisasi indeks awal dan akhir
        int start = 0;
        int end = input.length() - 1;

        // Mengecek palindrom dengan membandingkan karakter dari depan dan belakang
        while (start < end) {
            // Jika karakter tidak sama, maka bukan palindrom
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true; // Jika tidak ada perbedaan, itu adalah palindrom
    }
}
