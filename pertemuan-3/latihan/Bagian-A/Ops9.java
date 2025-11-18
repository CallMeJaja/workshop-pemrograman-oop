public class Ops9 {
    public static void main(String[] args) {
        int tugas = 80, uts = 70, uas = 90;
        double nilaiAkhir = 0.3 * tugas + 0.3 * uts + 0.4 * uas;
        String status = (nilaiAkhir >= 60) ? "Lulus" : "Tidak Lulus";
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Status: " + status);
    }
}
