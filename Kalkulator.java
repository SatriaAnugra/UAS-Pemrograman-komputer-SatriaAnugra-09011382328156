import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        // Deklarasi variabel
        int a;
        int b;
        int pilihan;

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        a = scanner.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        b = scanner.nextInt();

        // Menampilkan menu
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilihan Anda: ");
        pilihan = scanner.nextInt();
        scanner.close();

        // Melakukan operasi
        switch (pilihan) {
            case 1:
                System.out.println("Hasil: " + a + " + " + b + " = " + penjumlahan(a, b));
                break;
            case 2:
                System.out.println("Hasil: " + a + " - " + b + " = " + pengurangan(a, b));
                break;
            case 3:
                System.out.println("Hasil: " + a + " * " + b + " = " + perkalian(a, b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Hasil: " + a + " / " + b + " = " + pembagian(a, b));
                } else {
                    System.out.println("Pembagian dengan nol tidak valid");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }

    // Metode untuk melakukan penjumlahan
    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    // Metode untuk melakukan pengurangan
    public static int pengurangan(int a, int b) {
        return a - b;
    }

    // Metode untuk melakukan perkalian
    public static int perkalian(int a, int b) {
        return a * b;
    }

    // Metode untuk melakukan pembagian
    public static double pembagian(int a, int b) {
        return (double) a / b;
    }
}
