class Produk {
    int kode, harga;
    String nama;
}

public class Soal1 {
    public static void main(String[] args) {
        Produk produk1 = new Produk();
        Produk produk2 = new Produk();
        Produk produk3 = new Produk();

        produk1.kode = 101;
        produk1.nama = "Pensil";
        produk1.harga = 2000;
        produk2.kode = 102;
        produk2.nama = "Buku";
        produk2.harga = 5000;
        produk3.kode = 103;
        produk3.nama = "Penghapus";
        produk3.harga = 1000;
        System.out.println("Kode: " + produk1.kode + " | Nama: " + produk1.nama + " | Harga: " + produk1.harga);
        System.out.println("Kode: " + produk2.kode + " | Nama: " + produk2.nama + " | Harga: " + produk2.harga);
        System.out.println("Kode: " + produk3.kode + " | Nama: " + produk3.nama + " | Harga: " + produk3.harga);
    }
}