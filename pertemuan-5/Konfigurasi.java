class KonfigurasiMaster {
    public static final String APP_NAME = "Sistem Perpustakaan";
    public static final int MAKS_PINJAM = 5;
}

class Konfigurasi {
    public static void main(String[] args) {
        System.out.println("Aplikasi : " + KonfigurasiMaster.APP_NAME);
        System.out.println("Maksimal Peminjaman : " + KonfigurasiMaster.MAKS_PINJAM + " buku");
    }
}