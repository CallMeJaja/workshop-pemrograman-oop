class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int harga;
    private int stok;

    Barang(String kodeBarang, String namaBarang, int harga, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    void tambahStok(int jumlah) {
        stok += jumlah;
    }

    boolean kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            return true;
        } else {
            System.out.println("Stok tidak mencukupi untuk pengurangan.");
            return false;
        }
    }

    int hitungNilaiInventori() {
        return harga * stok;
    }

    void cekStokMinimal(int batasMinimal) {
        if (stok <= batasMinimal) {
            System.out.println("Stok menipis, segera restock.");
        } else {
            System.out.println("Stok aman.");
        }
    }

    void tampilkanInfo() {
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("----------------------------");
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    void setHarga(int harga) {
        this.harga = harga;
    }

    void setStok(int stok) {
        this.stok = stok;
    }

    void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

}

public class Soal8 {
    public static void main(String[] args) {
        Barang barang1 = new Barang("B001", "Pensil", 2000, 50);
        Barang barang2 = new Barang("B002", "Buku Tulis", 5000, 30);

        barang1.tampilkanInfo();
        barang2.tampilkanInfo();

        barang1.kurangiStok(10);
        barang2.tambahStok(20);

        System.out.println("Setelah update stok:");
        barang1.tampilkanInfo();
        barang2.tampilkanInfo();

        System.out.println("Nilai inventori barang1: Rp " + barang1.hitungNilaiInventori());
        System.out.println("Nilai inventori barang2: Rp " + barang2.hitungNilaiInventori());

        barang1.cekStokMinimal(15);
        barang2.cekStokMinimal(40);
    }
}
