class Mobil {
    private String merk;
    private String tipe;
    private int hargaPerHari;
    private boolean tersedia;

    Mobil(String merk, String tipe, int hargaPerHari) {
        this.merk = merk;
        this.tipe = tipe;
        this.hargaPerHari = hargaPerHari;
        this.tersedia = true;
    }

    int hitungBiayaRental(int jumlahHari) {
        int totalBiaya = hargaPerHari * jumlahHari;
        return totalBiaya;
    }

    double hitungDiskon(int jumlahHari) {
        if (jumlahHari >= 7) {
            return 0.15;
        } else if (jumlahHari >= 3) {
            return 0.10;
        } else {
            return 0.0;
        }
    }

    void rental(int jumlahHari) {
        if (tersedia) {
            int totalBiaya = hitungBiayaRental(jumlahHari);
            double diskon = hitungDiskon(jumlahHari);
            double biayaSetelahDiskon = totalBiaya - (totalBiaya * diskon);
            System.out.println("Mobil " + merk + " " + tipe + " berhasil dirental.");
            System.out.println("Total biaya setelah diskon: Rp " + biayaSetelahDiskon);
            tersedia = false;
        }
    }

    void kembalikan() {
        tersedia = true;
        System.out.println("Mobil " + merk + " " + tipe + " telah dikembalikan.");
    }

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public int getHargaPerHari() {
        return hargaPerHari;
    }

    public boolean isTersedia() {
        return tersedia;
    }
}

public class Soal7 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 300000);
        Mobil mobil2 = new Mobil("Honda", "Civic", 500000);

        mobil1.rental(5);
        mobil1.kembalikan();

        mobil2.rental(10);
        mobil2.kembalikan();
    }
}
