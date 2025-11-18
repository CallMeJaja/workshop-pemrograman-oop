public class Ops8 {
    public static void main(String[] args) {
        int total = 125_000;
        double diskon = (total >= 100_000) ? 0.1 : 0.0;
        double bayar = total - (total * diskon);
        System.out.println("Total \t\t\t: " + total);
        System.out.println("Diskon\t\t\t: " + (diskon * 100) + "%");
        System.out.println("Bayar Setelah Diskon\t: " + bayar);
    }
}
