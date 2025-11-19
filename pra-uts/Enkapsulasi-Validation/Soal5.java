class Rekening {
    private String noRekening;
    private String namaPemilik;
    private int saldo;

    Rekening(String noRekening, String namaPemilik, int saldo) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo tidak boleh negatif.");
        }
    }

    void setor(int jumlah) {
        if (jumlah >= 0) {
            saldo += jumlah;
        } else {
            System.out.println("Jumlah setor tidak boleh negatif.");
        }
    }

    void tarik(int jumlah) {
        if (jumlah >= 0 && jumlah <= saldo) {
            saldo -= jumlah;
        } else if (jumlah < 0) {
            System.out.println("Jumlah tarik tidak boleh negatif.");
        } else {
            System.out.println("Saldo tidak mencukupi untuk penarikan.");
        }
    }
}

public class Soal5 {
    public static void main(String[] args) {
        Rekening rekening1 = new Rekening("1234567890", "Andi", 1000000);
        System.out.println("No Rekening: " + rekening1.getNoRekening());
        System.out.println("Nama Pemilik: " + rekening1.getNamaPemilik());
        System.out.println("Saldo Awal: " + rekening1.getSaldo());
        rekening1.setor(500000);
        System.out.println("Saldo Setelah Setor: " + rekening1.getSaldo());
        rekening1.tarik(200000);
        System.out.println("Saldo Setelah Tarik: " + rekening1.getSaldo());
    }
}
