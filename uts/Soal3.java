class Smartphone {
    private String merk;
    private int stok;

    Smartphone(String merk, int stok) {
        this.merk = merk;
        this.stok = stok;
    }

    void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        }
    }

    void kurangiStok(int jumlah) {
        if (jumlah > 0 && jumlah <= this.stok) {
            this.stok -= jumlah;
        } else {
            System.out.println("Error : Stok kurang.");
        }
    }

    int getStok() {
        return this.stok;
    }

    String getMerk() {
        return this.merk;
    }
}

public class Soal3 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Samsung S24", 10);

        System.out.println("====== ENKAPSULASI INVENTORY ======");
        System.out.println("Menambahkan 5 Stok");
        s1.tambahStok(5);
        System.out.println("Stok Terbaru : " + s1.getStok());

        System.out.println("\nMengurangi 20 Stok");
        s1.kurangiStok(20);

        System.out.println("\nMengurangi 3 Stok");
        s1.kurangiStok(3);
        System.out.println("Stok Terbaru : " + s1.getStok());

        System.out.println("\n==== CEK AKHIR =====");
        System.out.println("Merk\t: " + s1.getMerk());
        System.out.println("Stok\t: " + s1.getStok());
    }
}
