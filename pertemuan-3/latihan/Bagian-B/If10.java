public class If10 {
    public static void main(String[] args) {
        int total = 120_000;
        double diskon;
        if (total >= 150_000)
            diskon = 0.15;
        else if (total >= 100_000)
            diskon = 0.10;
        else if (total >= 50_000)
            diskon = 0.05;
        else
            diskon = 0;
        double bayar = total - (total * diskon);
        System.out.println("Bayar: " + bayar);
    }
}
