public class LatihanArray1D {
    public static void main(String[] args) {
        int[] nilaiUjian = { 85, 90, 78, 92, 88 };

        System.out.println("Daftar Nilai Ujian:");
        for (int i = 0; i < nilaiUjian.length; i++) {
            System.out.println("Nilai Ujian ke-" + (i + 1) + ": " + nilaiUjian[i]);
        }
    }
}
