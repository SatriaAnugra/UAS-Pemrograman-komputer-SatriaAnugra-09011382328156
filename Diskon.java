import java.util.Scanner;

public class Diskon {

    public static void main(String[] args) {
        // Deklarasi variabel
        int jumlahBarang;
        int hargaBarang;
        double diskon; // Menggunakan tipe data double untuk diskon agar hasil perhitungan lebih akurat
        double totalHarga; // Menggunakan tipe data double untuk totalHarga agar hasil perhitungan lebih akurat

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah barang yang dibeli: ");
        jumlahBarang = scanner.nextInt();
        System.out.print("Harga satuan barang: ");
        hargaBarang = scanner.nextInt();
        scanner.close();
        // Menghitung diskon
        diskon = getDiskon(jumlahBarang);

        // Menghitung total harga
        totalHarga = jumlahBarang * hargaBarang * (1 - (diskon / 100));

        // Menampilkan hasil
        System.out.println("Total harga yang harus dibayar: Rp" + totalHarga);
    }

    private static double getDiskon(int jumlahBarang) {
        if (jumlahBarang < 5) {
            return 0;
        } else if (jumlahBarang <= 10) {
            return 5;
        } else if (jumlahBarang <= 20) {
            return 10;
        } else {
            return 20;
        }
    }
}
