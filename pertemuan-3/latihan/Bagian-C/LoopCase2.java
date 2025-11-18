public class LoopCase2 {
    public static void main(String[] args) {
        int[] nilai = { 80, 75, 90, 60, 88 };
        int min = nilai[0], max = nilai[0], sum = 0;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < min)
                min = nilai[i];
            if (nilai[i] > max)
                max = nilai[i];
            sum += nilai[i];
        }
        double avg = (double) sum / nilai.length;
        System.out.println("Min: " + min + ", Max: " + max + ", Avg: " + avg);
    }
}