package Soal7;

class Pegawai {
    String nama, jabatan;
    int gaji;

    Pegawai(String nama, String jabatan, int gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    void infoPegawai() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
        System.out.println();
    }
}

public class Soal7 {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai("Andi", "Manager", 8000000);
        Pegawai p2 = new Pegawai("Budi", "Staff", 5000000);

        p1.infoPegawai();
        p2.infoPegawai();
    }
}