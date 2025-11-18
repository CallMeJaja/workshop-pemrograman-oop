class Peminjaman {
    int id, lamaHari, denda;
}

class Soal3 {
    public static void main(String[] args) {
        Peminjaman peminjaman = new Peminjaman();
        System.out.println("ID Peminjaman: " + peminjaman.id);
        System.out.println("Lama Hari: " + peminjaman.lamaHari);
        System.out.println("Denda: " + peminjaman.denda);

        peminjaman.id = 1;
        peminjaman.lamaHari = 5;
        peminjaman.denda = 10000;
        System.out.println("\nID Peminjaman: " + peminjaman.id);
        System.out.println("Lama Hari: " + peminjaman.lamaHari);
        System.out.println("Denda: " + peminjaman.denda);
    }
}