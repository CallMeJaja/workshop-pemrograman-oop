public class IfCase2 {
    public static void main(String[] args) {
        int jam = 6;
        int tarif;
        if (jam < 2)
            tarif = 5000;
        else if (jam <= 5)
            tarif = 10_000;
        else
            tarif = 10_000 + (jam - 5) * 2000;
        System.out.println("Tarif: " + tarif);
    }
}
