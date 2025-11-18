class Karyawan {
    private String nama;
    private double gaji;

    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gajiBaru) {
        if (gajiBaru > 0) {
            this.gaji = gajiBaru;
        } else {
            System.out.println("Gaji tidak boleh negatif.");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Andi", 5000);
        Karyawan karyawan2 = new Karyawan("Budi", 6000);

        System.out.println("Nama: " + karyawan1.getNama() + ", Gaji: " + karyawan1.getGaji());
        System.out.println("Nama: " + karyawan2.getNama() + ", Gaji: " + karyawan2.getGaji());

        karyawan1.setGaji(0);
        System.out.println("Gaji baru " + karyawan1.getNama() + ": " + karyawan1.getGaji());
    }
}
