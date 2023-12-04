import java.util.Scanner;

public class linearperpustakaan {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        String[] judulBuku = {
            "Java Programming",
            "Data Structures and Algorithms",
            "Introduction to AI",
            "Database Management",
            "Web Development"
        };
        String[] author = {
            "John Smith",
            "Alice Johnson",
            "Robert Williams",
            "Emily Davis",
            "Michael Brown"
        };
        int[] tahun = {2020, 2019, 2022, 2018, 2021};
        // Mendeklarasikan kelas Buku
        class Buku {

            private String judul;
            private String penulis;
            private int tahunTerbit;
            private boolean tersedia;

            public Buku(String judul, String penulis, int tahunTerbit) {
                this.judul = judul;
                this.penulis = penulis;
                this.tahunTerbit = tahunTerbit;
                this.tersedia = true;
            }

            public String getJudul() {
                return judul;
            }

            public void tampilkanInformasi() {
                System.out.println("Judul: " + judul);
                System.out.println("Penulis: " + penulis);
                System.out.println("Tahun Terbit: " + tahunTerbit);
                System.out.println("Tersedia: " + tersedia);
            }

            public void pinjam() {
                this.tersedia = false;
            }
        }

        // Membuat objek Buku
        Buku[] buku = new Buku[judulBuku.length];
        for (int i = 0; i < judulBuku.length; i++) {
            buku[i] = new Buku(judulBuku[i], author[i], tahun[i]);
        }

        // Menampilkan informasi buku secara terstruktur
        System.out.println("Informasi Buku:");
        for (int i = 0; i < buku.length; i++) {
            buku[i].tampilkanInformasi();
            System.out.println();
        }

        try (// Menerima input judul buku dari pengguna
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan judul buku yang ingin Anda cari: ");
            String judulDicari = scanner.nextLine();

            // Mencari informasi buku berdasarkan judul yang dimasukkan pengguna
            boolean ditemukan = false;
            for (int i = 0; i < buku.length; i++) {
                if (buku[i].getJudul().equalsIgnoreCase(judulDicari)) {
                    ditemukan = true;

                    // Jika buku ditemukan, lakukan peminjaman
                    buku[i].pinjam();
                    
                    // Tampilkan informasi buku
                    System.out.println("Buku dengan judul '" + judulDicari + "' ditemukan.");
                    System.out.println("Informasi Buku:");
                    buku[i].tampilkanInformasi();
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Buku dengan judul '" + judulDicari + "' tidak ditemukan.");
            }
        }
    }
}
