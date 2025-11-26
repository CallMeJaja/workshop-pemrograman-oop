class Karyawan {
    String nama;
    int gajiPokok;
    String divisi;

    Karyawan(String nama, int gajiPokok, String divis) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.divisi = divis;
    }

    int hitungTunjangan() {
        if (divisi.equals("IT")) {
            return (int) (gajiPokok * 0.2);
        } else {
            return (int) (gajiPokok * 0.1);
        }
    }

    void cetakSlip() {
        System.out.println("Slip Gaji Karyawan");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Divisi \t\t: " + divisi);
        System.out.println("Gaji Pokok \t: Rp." + gajiPokok);
        System.out.println("Tunjangan \t: Rp." + hitungTunjangan());
        System.out.println("Total Gaji \t: Rp." + (gajiPokok + hitungTunjangan()));
    }
}

public class Soal2 {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Budi", 5000000, "IT");
        Karyawan karyawan2 = new Karyawan("Siti", 4000000, "HRD");

        karyawan1.cetakSlip();
        System.out.println();
        karyawan2.cetakSlip();
    }
}
