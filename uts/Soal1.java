public class Soal1 {
    public static void main(String[] args) {
        int[] dataNilai = { 70, 85, 90, 65, 40, 55, 95, 80 };
        float rataRata = 0;
        int jumlahLulus = 0;

        System.out.println("Analisis Nilai:");
        for (int i = 0; i < dataNilai.length; i++) {
            rataRata += dataNilai[i];
            if (dataNilai[i] >= 75) {
                System.out.println("Nilai " + dataNilai[i] + " : Lulus");
                jumlahLulus++;
            } else {
                System.out.println("Nilai " + dataNilai[i] + " : Tidak Lulus");
            }
        }
        rataRata /= dataNilai.length;

        System.out.println("");
        System.out.println("Statistik:");
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Jumlah Lulus: " + jumlahLulus + " Orang");
    }
}