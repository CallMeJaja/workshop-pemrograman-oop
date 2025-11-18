public class HitungRataRata {
    public static void main(String[] args) {
        int[] nilaiUjian = { 85, 90, 78, 92, 88 };
        int total = 0;

        for (int nilai : nilaiUjian) {
            total += nilai;
        }

        double rataRata = (double) total / nilaiUjian.length;

        System.out.println("Total Nilai: " + total);
        System.out.println("Jumlah Elemen : " + nilaiUjian.length);
        System.out.printf("Nilai Rata-rata: %.2f\n", rataRata);
    }
}
