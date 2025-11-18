class MasterMahasiswa {
    String nama, nim, jurusan;
    float ipk;
}

class Mahasiswa {
    public static void main(String[] args) {

        MasterMahasiswa obj1 = new MasterMahasiswa();
        MasterMahasiswa obj2 = new MasterMahasiswa();

        obj1.nama = "Reza";
        obj1.nim = "202404021";
        obj1.jurusan = "Teknologi Rekayasa Perangkat Lunak";
        obj1.ipk = 4;

        obj2.nama = "Asriano";
        obj2.nim = "202404040404";
        obj2.jurusan = "Teknologi Manufaktur";
        obj2.ipk = 3;

        System.out.println("Nama \t: " + obj1.nama);
        System.out.println("NIM \t: " + obj1.nim);
        System.out.println("Jurusan : " + obj1.jurusan);
        System.out.println("IPK \t: " + obj1.ipk);

        System.out.println("\nNama \t: " + obj2.nama);
        System.out.println("NIM \t: " + obj2.nim);
        System.out.println("Jurusan : " + obj2.jurusan);
        System.out.println("IPK \t: " + obj2.ipk);

    }

}