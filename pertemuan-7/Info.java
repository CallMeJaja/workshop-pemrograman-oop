class Rekening {
    public int no_rekening;
    public String nama;
    protected float saldo;

    public void tampil() {
        System.out.println("Nama = " + nama);
        System.out.println("No Rekening untuk pelanggan ini  = " + no_rekening);
        System.out.println("Saldo = " + saldo);
    }
}

public class Info {
    public static void main(String[] args) {
        Rekening p = new Rekening();
        p.no_rekening = 1234;
        p.nama = "Reza Asriano Maulana";
        p.saldo = 10000;
        p.tampil();
    }
}