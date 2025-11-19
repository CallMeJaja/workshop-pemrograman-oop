class Produk {
    String kode;
    String nama;
    int harga;
    int stok;

    Produk(String nama) {
        this.nama = nama;
    }

    Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    Produk(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void tampilkanInfo() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Stok : " + stok);
        System.out.println("-----------------------");
    }
}

public class Soal4 {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Laptop");
        Produk produk2 = new Produk("Smartphone", 5000000);
        Produk produk3 = new Produk("P001", "Tablet", 3000000, 50);

        produk1.tampilkanInfo();
        produk2.tampilkanInfo();
        produk3.tampilkanInfo();
    }
}
