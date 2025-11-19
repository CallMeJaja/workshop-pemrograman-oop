class Mahasiswa {
    String nama;
    String nim;
    double ipk;
    static int jumlahMahasiswa;
}

public class Soal2 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Reza";
        mhs1.nim = "001";
        mhs1.ipk = 3.3;
        Mahasiswa.jumlahMahasiswa++;

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Maulana";
        mhs2.nim = "002";
        mhs2.ipk = 3.1;
        Mahasiswa.jumlahMahasiswa++;

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nama = "Asriano";
        mhs3.nim = "003";
        mhs3.ipk = 4.0;
        Mahasiswa.jumlahMahasiswa++;

        System.out.println("Nama Mahasiswa 1 : " + mhs1.nama);
        System.out.println("NIM Mahasiswa 1: " + mhs1.nim);
        System.out.println("IPK Mahasiswa 1: " + mhs1.ipk);
        System.out.println();
        System.out.println("Nama Mahasiswa 2: " + mhs2.nama);
        System.out.println("NIM Mahasiswa 2: " + mhs2.nim);
        System.out.println("IPK Mahasiswa 2: " + mhs2.ipk);
        System.out.println();
        System.out.println("Nama Mahasiswa 3: " + mhs3.nama);
        System.out.println("NIM Mahasiswa 3: " + mhs3.nim);
        System.out.println("IPK Mahasiswa 3: " + mhs3.ipk);
        System.out.println();
        System.out.println("Total Jumlah Mahasiswa : " + Mahasiswa.jumlahMahasiswa);
    }
}
