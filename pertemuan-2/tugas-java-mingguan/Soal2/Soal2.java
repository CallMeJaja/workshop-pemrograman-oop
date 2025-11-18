package Soal2;

class Mahasiswa {
    String nama, nim;

    void info() {
        System.out.println("Mahasiswa : " + nama + "(" + nim + ")");
    }
}

class Soal2 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Budi";
        mhs1.nim = "23001";

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Sari";
        mhs2.nim = "23002";

        mhs1.info();
        mhs2.info();
    }
}