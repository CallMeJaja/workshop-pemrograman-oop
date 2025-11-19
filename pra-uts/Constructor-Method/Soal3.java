class Karyawan {
    String nama;
    String jabatan;
    int gaji;

    Karyawan(String nama, String jabatan, int gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
        System.out.println("-----------------------");
    }

    void hitungGajiTahunan() {
        int gajiTahunan = gaji * 12;
        System.out.println("Gaji Tahunan: " + gajiTahunan);
    }
}

public class Soal3 {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Andi", "Manager", 8000000);
        Karyawan karyawan2 = new Karyawan("Budi", "Staff", 5000000);

        karyawan1.tampilkanInfo();
        karyawan1.hitungGajiTahunan();
        System.out.println("=======================");
        karyawan2.tampilkanInfo();
        karyawan2.hitungGajiTahunan();
    }
}
