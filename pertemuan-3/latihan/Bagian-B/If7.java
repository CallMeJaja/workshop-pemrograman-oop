public class If7 {
    public static void main(String[] args) {
        int umur = 25;
        String negara = "ID";
        if (umur >= 18 && umur <= 60 && negara.equals("ID")) {
            System.out.println("Memenuhi syarat");
        } else {
            System.out.println("Tidak memenuhi syarat");
        }
    }
}
