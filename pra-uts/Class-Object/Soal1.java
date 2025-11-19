class Buku {
    String judul;
    String pengarang;
    int harga;
}

public class Soal1 {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java";
        buku1.pengarang = "Budi";
        buku1.harga = 75000;

        Buku buku2 = new Buku();
        buku2.judul = "Dasar-Dasar Python";
        buku2.pengarang = "Reza";
        buku2.harga = 1000000;

        System.out.println("Judul Buku 1: " + buku1.judul);
        System.out.println("Pengarang Buku 1: " + buku1.pengarang);
        System.out.println("Harga Buku 1: " + buku1.harga);

        System.out.println("Judul Buku 2: " + buku2.judul);
        System.out.println("Pengarang Buku 2: " + buku2.pengarang);
        System.out.println("Harga Buku 2: " + buku2.harga);
    }
}