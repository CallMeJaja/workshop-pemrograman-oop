class AkunBank {
    int nomor, saldo;
}

class Soal5 {
    public static void main(String[] args) {
        AkunBank a1 = new AkunBank();
        a1.nomor = 12345;
        a1.saldo = 500000;
        System.out.println("Nomor Akun a1: " + a1.nomor);
        System.out.println("Saldo a1: " + a1.saldo);

        AkunBank a2 = a1;
        a2.nomor = 67890;
        a2.saldo = 750000;
        System.out.println("Saldo a1: " + a1.saldo);
        System.out.println("\nNomor Akun a2: " + a2.nomor);
        System.out.println("Saldo a2: " + a2.saldo);
    }
}