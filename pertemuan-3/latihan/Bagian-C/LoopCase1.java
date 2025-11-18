public class LoopCase1 {
    public static void main(String[] args) {
        double saldo = 1_000_000;
        double bunga = 0.02;
        for (int bulan = 1; bulan <= 12; bulan++) {
            saldo += saldo * bunga;
            System.out.println("Bulan " + bulan + " : " + String.format("%.2f", saldo));
        }
    }
}