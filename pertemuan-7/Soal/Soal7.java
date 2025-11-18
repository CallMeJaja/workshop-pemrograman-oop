class Utilitas {
    private Utilitas() {

    }

    public static int tambah(int a, int b) {
        return a + b;
    }
}

public class Soal7 {
    public static void main(String[] args) {
        int hasil = Utilitas.tambah(5, 10);
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}