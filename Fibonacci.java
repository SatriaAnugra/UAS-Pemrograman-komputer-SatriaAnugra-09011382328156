import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // Deklarasi variabel
        int n;
        int a = 0;
        int b = 1;
        int c;
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        n = scanner.nextInt();
        scanner.close();
        // Menampilkan deret Fibonacci
        System.out.print("Deret Fibonacci: ");
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}