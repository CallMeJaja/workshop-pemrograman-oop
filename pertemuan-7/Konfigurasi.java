public class Konfigurasi {
    private final String VERSI_APLIKASI = "1.0.1-STABLE";

    public String getVersi() {
        return VERSI_APLIKASI;
    }

    public static void main(String[] args) {
        Konfigurasi config = new Konfigurasi();
        System.out.println("Versi : " + config.getVersi());
        // config.VERSI_APLIKASI = "2.0";
    }
}
