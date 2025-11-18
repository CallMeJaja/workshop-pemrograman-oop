class Siswa {
    private String nama;
    private int nilai;

    public void setNilai(int nilai) {
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid!.");
        } else {
            this.nilai = nilai;
        }
    }

    public int getNilai() {
        return nilai;
    }

    public String getNama() {
        return nama;
    }
}

public class Soal4 {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa();
        siswa1.setNilai(95);
        System.out.println("Nilai siswa: " + siswa1.getNilai());
        siswa1.setNilai(110);
    }
}
