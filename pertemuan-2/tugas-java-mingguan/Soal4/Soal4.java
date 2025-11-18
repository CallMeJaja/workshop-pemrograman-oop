package Soal4;

class Buku {
    String judul;

    Buku(String judul) {
        this.judul = judul;
    }
}

class Soal4 {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java");
        System.out.println("Judul buku: " + buku1.judul);
    }
}