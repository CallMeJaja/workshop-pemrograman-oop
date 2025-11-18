class SensorMaster {
    int hitung;
    double suhu;
    boolean aktif;
    String lokasi;
}

public class Sensor {
    public static void main(String[] args) {
        SensorMaster s = new SensorMaster();
        System.out.println(s.hitung + ", " + s.suhu + ", " + s.aktif + ", " + s.lokasi);
    }
}