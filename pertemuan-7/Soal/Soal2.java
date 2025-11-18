public class Soal2 {
    public static void main(String[] args) {
        int[] nilai = { 85, 90, 78, 92, 88 };
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }

        System.out.println("Total nilai: " + total);
    }
}
