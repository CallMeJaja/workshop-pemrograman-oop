class BukuMaster {
    String judul, penulis;
    int jmlHalaman;

    BukuMaster() {
        judul = "Tanpa Judul";
        penulis = "Anonim";
        jmlHalaman = 100;
    }
}

class Buku {
    public static void main(String[] args) {
        BukuMaster b = new BukuMaster();
        System.out.println("Judul: " + b.judul);
        System.out.println("Penulis: " + b.penulis);
        System.out.println("Jumlah Halaman: " + b.jmlHalaman);
    }
}