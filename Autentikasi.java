import java.util.Scanner;

public class Autentikasi {

    public static void main(String[] args) {
        // Username dan password yang telah ditentukan
        String username = "satria anugra";
        String password = "564000";

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();
        scanner.close();
        // Memeriksa apakah username dan password yang dimasukkan sesuai
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
    }
}
