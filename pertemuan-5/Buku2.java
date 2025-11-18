class BukuMaster2 {
    String judul;

    BukuMaster2(String judul) {
        this.judul = judul;
    }
}

class Buku2 {
    public static void main(String[] args) {
        BukuMaster2 b1 = new BukuMaster2("Clean Code");
        System.out.println("Buku 1: " + b1.judul);
    }
}