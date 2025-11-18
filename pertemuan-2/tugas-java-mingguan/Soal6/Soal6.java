package Soal6;

class Buku {
    String judul, penulis;
    int jumlahHalaman;

    void infoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
    }
}

class Soal6 {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java";
        buku1.penulis = "Budi";
        buku1.jumlahHalaman = 350;

        buku1.infoBuku();
    }
}