class Sistem {
    public static final String APP_VERSION = "1.0.0";
    public static final int MAX_USERS = 100;
}

class User {
    String nama;
    boolean aktif;
}

class Soal2 {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        user1.nama = "Reza";
        user1.aktif = true;
        user2.nama = "Maulana";
        user2.aktif = false;

        System.out.println("Aplikasi Versi: " + Sistem.APP_VERSION);
        System.out.println("Maksimum Pengguna: " + Sistem.MAX_USERS);
        System.out.println("User 1: " + user1.nama + " | Aktif: " + user1.aktif);
        System.out.println("User 2: " + user2.nama + " | Aktif: " + user2.aktif);
    }
}