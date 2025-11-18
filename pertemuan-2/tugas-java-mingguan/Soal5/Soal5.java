package Soal5;

class Akun {
    public String username;
    private String password;

    void ubahPassword() {
        this.password = "admin123";
    }
}

class Soal5 {
    public static void main(String[] args) {
        Akun akun1 = new Akun();
        akun1.username = "admin";
        akun1.ubahPassword();
        System.out.println("Username: " + akun1.username);
        System.out.println("Password berhasil diubah!");
    }
}