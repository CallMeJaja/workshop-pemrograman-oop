public class Soal6 {
    public static void main(String[] args) {
        int[] data = { 15, 8, 27, 4, 33, 12 };
        int nilaiMinimum;
        int nilaiMaksimum;

        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        nilaiMinimum = data[0];
        nilaiMaksimum = data[data.length - 1];

        System.out.println("Nilai minimum: " + nilaiMinimum);
        System.out.println("Nilai maksimum: " + nilaiMaksimum);
    }
}
