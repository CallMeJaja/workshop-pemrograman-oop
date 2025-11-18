public class Utilitas {
    private Utilitas() {
        throw new UnsupportedOperationException("Kelas Utilitas tidak dapat diinstansiasi.");
    }

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int hasil = Utilitas.tambah(5, 10);
        System.out.println("Hasil penjumlahan: " + hasil);
        // Utilitas util = new Utilitas();
    }
}