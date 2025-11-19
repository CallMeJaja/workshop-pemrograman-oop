class Siswa {
    private String nama;
    private int nilai;
    private char grade;

    Siswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    void hitungGrade() {
        if (nilai >= 85) {
            grade = 'A';
        } else if (nilai >= 70) {
            grade = 'B';
        } else if (nilai >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }

    public char getGrade() {
        return grade;
    }

    void tampilkanHasil() {
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------");
    }
}

public class Soal6 {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa("Budi", 90);
        siswa1.hitungGrade();
        siswa1.tampilkanHasil();

        Siswa siswa2 = new Siswa("Siti", 75);
        siswa2.hitungGrade();
        siswa2.tampilkanHasil();

        Siswa siswa3 = new Siswa("Ani", 65);
        siswa3.hitungGrade();
        siswa3.tampilkanHasil();
    }
}
