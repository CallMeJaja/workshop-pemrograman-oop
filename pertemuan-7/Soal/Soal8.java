class Pegawai {
    protected String nama;
    protected double gaji;

    Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }
}

class Manager extends Pegawai {
    Manager(String nama, double gaji) {
        super(nama, gaji);
    }

    public void tampilkanInfoManajer() {
        System.out.println("Nama Manajer: " + nama);
        System.out.println("Gaji Manajer: " + gaji);
    }
}

public class Soal8 {
    public static void main(String[] args) {
        Manager manajer = new Manager("Reza", 8000000);
        manajer.tampilkanInfoManajer();
    }
}