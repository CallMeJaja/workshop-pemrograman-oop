public class Mahasiswa {
    String npm;
    private String nama;

    public Mahasiswa(String npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }

    public void cetakData() {
        System.out.println("NPM : " + npm);
        System.out.println("Nama : " + nama);
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("21081010120", "Alice");
        Mahasiswa mhs2 = new Mahasiswa("21081010121", "Bob");

        mhs1.cetakData();
        System.out.println();
        mhs2.cetakData();
    }
}
