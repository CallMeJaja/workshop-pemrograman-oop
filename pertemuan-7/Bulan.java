public class Bulan {
    static String[] bulan = new String[12];

    public static void main(String[] args) {
        Bulan.bulan[0] = "Januari";
        Bulan.bulan[1] = "Februari";
        Bulan.bulan[2] = "Maret";
        Bulan.bulan[3] = "April";
        Bulan.bulan[4] = "Mei";
        Bulan.bulan[5] = "Juni";
        Bulan.bulan[6] = "Juli";
        Bulan.bulan[7] = "Agustus";
        Bulan.bulan[8] = "September";
        Bulan.bulan[9] = "Oktober";
        Bulan.bulan[10] = "November";
        Bulan.bulan[11] = "Desember";

        for (int i = 0; i < Bulan.bulan.length; i++) {
            System.out.println("Bulan ke-" + (i + 1) + " adalah " + Bulan.bulan[i]);
        }
    }
}
