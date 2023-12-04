import java.util.Scanner;
public class AkunPengguna {
    private String username;
    private boolean isActive;
    public AkunPengguna(String username, String password) {
        this.username = username;
        this.isActive = true; // Saat membuat akun baru, secara default dianggap aktif
    }
    public void activateAccount() {
        this.isActive = true;
        System.out.println("Akun " + this.username + " telah diaktifkan.");
    }
    public void deactivateAccount() {
        this.isActive = false;
        System.out.println("Akun " + this.username + " telah dinonaktifkan.");
    }
    public boolean isActive() {
        return isActive;
    }
    public String getUsername() {
        return username;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: satria ganteng");
        String inputUsername = scanner.nextLine();

        System.out.print("Masukkan password: ganteng 123 ");
        String inputPassword = scanner.nextLine();

        AkunPengguna user1 = new AkunPengguna(inputUsername, inputPassword);

        System.out.println("Status akun " + user1.getUsername() + ": Aktif = " + user1.isActive());

        user1.deactivateAccount();
        
        System.out.println("Status akun " + user1.getUsername() + ": Aktif = " + user1.isActive());
        scanner.close();
    }
}