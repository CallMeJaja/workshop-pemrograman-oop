class Produk {
    String nama;
    int harga;

    Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

class Kasir {
    int totalBelanja = 0;
    int totalAkhir = 0;
    int diskon = 0;

    void scan(Produk produk) {
        System.out.println("Nama Produk \t: " + produk.nama);
        System.out.println("Harga Produk \t: Rp." + produk.harga + "\n");
        totalBelanja += produk.harga;
    }

    void tampilkanTotal() {
        System.out.println("Total Belanja \t: Rp." + totalBelanja);

        if (totalBelanja > 100000) {
            diskon = (int) (0.1 * totalBelanja);
            totalAkhir = totalBelanja - (int) diskon;
            System.out.println("Diskon \t\t: Rp." + diskon);
            System.out.println("Total Akhir \t: Rp." + totalAkhir);
        } else {
            System.out.println("Tidak Mendapatkan Diskon");
            System.out.println("Total Akhir \t: Rp." + totalAkhir);
        }
    }
}

class StudiKasus1 {
    public static void main(String[] args) {
        Produk p1 = new Produk("Buku Tulis", 25000);
        Produk p2 = new Produk("Mouse Gaming", 150000);
        Produk p3 = new Produk("Pensil", 5000);

        Kasir kasir1 = new Kasir();
        kasir1.scan(p1);
        kasir1.scan(p2);
        kasir1.scan(p3);
        kasir1.tampilkanTotal();
    }
}