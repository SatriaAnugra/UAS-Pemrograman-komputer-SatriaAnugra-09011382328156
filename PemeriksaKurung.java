import java.util.Stack;

public class PemeriksaKurung {

    // Metode untuk memeriksa kecocokan kurung pada ekspresi matematika
    public static boolean cekKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ekspresi.length(); i++) {
            char karakter = ekspresi.charAt(i);

            if (karakter == '(') {
                stack.push(karakter);
            } else if (karakter == ')') {
                // Jika stack kosong atau kurung buka terakhir tidak cocok dengan kurung tutup saat ini
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false; // Urutan kurung salah
                } else {
                    stack.pop(); // Kurung buka yang sesuai ditemukan, hapus dari stack
                }
            }
        }

        return stack.isEmpty(); // Jika stack kosong, urutan kurung benar
    }

    public static void main(String[] args) {
        String ekspresi1 = "(2 + 3) * (5 - 4)";
        String ekspresi2 = "((8 * 2) - 4";

        if (cekKurung(ekspresi1)) {
            System.out.println(ekspresi1 + "spresi 1 benar.");
        } else {
            System.out.println("Urutan kurung pada ekspresi 1 salah.");
        }

        if (cekKurung(ekspresi2)) {
            System.out.println(ekspresi2 + "pada ekspresi 2 benar");
        } else {
            System.out.println(ekspresi2 + "pada ekspresi 2 salah.");
        }
    }
}