package Soal3;

class Mobil {
    String merek, tahun;

    Mobil(String merek, String tahun) {
        this.merek = merek;
        this.tahun = tahun;
    }

    void info() {
        System.out.println("Mobil: " + merek + ", Tahun: " + tahun);
    }
}

class Soal3 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "2020");
        Mobil mobil2 = new Mobil("Honda", "2021");

        mobil1.info();
        mobil2.info();
    }
}