public class RekeningBank {
    private double saldo = 0.0;

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor Rp." + jumlah + ". saldo sekarang Rp." + saldo);
        } else {
            System.out.println("Setoran harus lebih dari nol.");
        }
    }

    public boolean tarik(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Tarik Rp." + jumlah + ". Saldo sekarang Rp." + saldo);
            return true;
        } else if (saldo < jumlah) {
            System.out.println("Gagal tarik. Saldo tidak mencukupi.");
            return false;
        } else {
            System.out.println("Jumlah penarikan harus lebih dari nol.");
            return false;
        }
    }

    public static void main(String[] args) {
        RekeningBank rekening = new RekeningBank();
        rekening.setor(100000);
        rekening.tarik(25000);
        rekening.tarik(80000);
    }
}