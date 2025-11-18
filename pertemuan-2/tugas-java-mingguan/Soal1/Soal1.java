package Soal1;

class Mahasiswa {
    String nama, nim;
}

class Soal1 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Budi";
        mhs1.nim = "23001";

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Sari";
        mhs2.nim = "23002";

        System.out.println("Nama: " + mhs1.nama + ", NIM: " + mhs1.nim);
        System.out.println("Nama: " + mhs2.nama + ", NIM: " + mhs2.nim);
    }
}