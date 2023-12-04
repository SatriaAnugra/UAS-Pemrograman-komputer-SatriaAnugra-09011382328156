import java.util.Scanner;

public class Faktorisasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan bulat positif:");
        int x = input.nextInt();

        System.out.println("Faktorisasi " + x + ":");
        faktorisasi(x);
        input.close();
    }

    private static void faktorisasi(int x) {
        // Loop untuk mencari faktor-faktor primanya
        for (int i = 2; i <= x; i++) {
            while (x % i == 0) {
                // Jika x habis dibagi i, maka i adalah faktor prima dari x
                System.out.print(i);
                x /= i;
                
                // Cek apakah masih terdapat faktor-faktor prima lainnya
                if (x > 1) {
                    System.out.print(" * "); // Tampilkan operator perkalian jika masih ada faktor lainnya
                }
            }
        }
    }
}