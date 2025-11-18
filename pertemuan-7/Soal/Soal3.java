class Buku {
    private String judul;
    private int jmlHalaman;

    public Buku(String judul, int jmlHalaman) {
        this.judul = judul;
        this.jmlHalaman = jmlHalaman;
    }

    public void tampilInfo() {
        System.out.println("Buku " + judul + " memiliki " + jmlHalaman + " halaman.");
    }
}

public class Soal3 {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java", 350);

        buku1.tampilInfo();
    }
}