class Mahasiswa {
    String nim;
    String nama;
    int nilaiTugas;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa(String nim, String nama, int nilaiTugas, int nilaiUTS, int nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    double hitungNilaiAkhir() {
        return (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    char getIndeksNilai() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 80) {
            return 'A';
        } else if (nilaiAkhir >= 70) {
            return 'B';
        } else if (nilaiAkhir >= 60) {
            return 'C';
        } else if (nilaiAkhir >= 50) {
            return 'D';
        } else {
            return 'E';
        }
    }

    void tampilkanInfoLengkap() {
        System.out.println("NIM \t\t: " + nim);
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Nilai Tugas \t: " + nilaiTugas);
        System.out.println("Nilai UTS \t: " + nilaiUTS);
        System.out.println("Nilai UAS \t: " + nilaiUAS);
        System.out.printf("Nilai Akhir \t: %.2f\n", hitungNilaiAkhir());
        System.out.println("Indeks Nilai \t: " + getIndeksNilai() + "\n");
    }
}

class StudiKasus3 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("001", "Budi", 80, 70, 90);
        Mahasiswa mhs2 = new Mahasiswa("002", "Ani", 60, 85, 75);
        Mahasiswa mhs3 = new Mahasiswa("003", "Citra", 50, 65, 40);

        System.out.println("=== Data Mahasiswa 1 ===");
        mhs1.tampilkanInfoLengkap();

        System.out.println("=== Data Mahasiswa 2 ===");
        mhs2.tampilkanInfoLengkap();

        System.out.println("=== Data Mahasiswa 3 ===");
        mhs3.tampilkanInfoLengkap();
    }
}