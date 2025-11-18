class AkunMaster {
    String pemilik;
    int saldo;
}

class Akun {
    public static void main(String[] args) {
        AkunMaster a = new AkunMaster();
        a.pemilik = "Dina";
        System.out.println(a.pemilik + "| Saldo Awal : " + a.saldo);
        a.saldo = 150_000;
        System.out.println(a.pemilik + "| Saldo Akhir : " + a.saldo);

    }
}