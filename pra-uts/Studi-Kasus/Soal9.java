class NilaiMahasiswa {
    private String nama;
    private String nim;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;
    private double nilaiAkhir;
    private char hurufMutu;
    private String keterangan;

    NilaiMahasiswa(String nama, String nim, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    void hitungNilaiAkhir() {
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.40 * nilaiUAS);
    }

    void tentukanHurufMutu() {
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            hurufMutu = 'A';
            keterangan = "LULUS";
        } else if (nilaiAkhir >= 70 && nilaiAkhir < 80) {
            hurufMutu = 'B';
            keterangan = "LULUS";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 70) {
            hurufMutu = 'C';
            keterangan = "LULUS BERSYARAT";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            hurufMutu = 'D';
            keterangan = "TIDAK LULUS";
        } else if (nilaiAkhir >= 0 && nilaiAkhir < 50) {
            hurufMutu = 'E';
            keterangan = "TIDAK LULUS";
        }
    }

    void prosesNilai() {
        hitungNilaiAkhir();
        tentukanHurufMutu();
    }

    void tampilkanTranskrip() {
        System.out.println("Nama       : " + nama);
        System.out.println("NIM        : " + nim);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS  : " + nilaiUTS);
        System.out.println("Nilai UAS  : " + nilaiUAS);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Huruf Mutu : " + hurufMutu);
        System.out.println("Keterangan : " + keterangan);
        System.out.println("----------------------------");
    }

    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    double getNilaiTugas() {
        return nilaiTugas;
    }

    double getNilaiUTS() {
        return nilaiUTS;
    }

    double getNilaiUAS() {
        return nilaiUAS;
    }

    double getNilaiAkhir() {
        return nilaiAkhir;
    }

    char getHurufMutu() {
        return hurufMutu;
    }

    String getKeterangan() {
        return keterangan;
    }
}

public class Soal9 {
    public static void main(String[] args) {
        NilaiMahasiswa mhs1 = new NilaiMahasiswa("Andi", "A001", 85, 80, 90);
        NilaiMahasiswa mhs2 = new NilaiMahasiswa("Budi", "A002", 70, 75, 65);
        NilaiMahasiswa mhs3 = new NilaiMahasiswa("Citra", "A003", 55, 60, 50);
        NilaiMahasiswa mhs4 = new NilaiMahasiswa("Dewi", "A004", 40, 45, 35);

        mhs1.prosesNilai();
        mhs2.prosesNilai();
        mhs3.prosesNilai();
        mhs4.prosesNilai();

        mhs1.tampilkanTranskrip();
        mhs2.tampilkanTranskrip();
        mhs3.tampilkanTranskrip();
        mhs4.tampilkanTranskrip();
    }
}
