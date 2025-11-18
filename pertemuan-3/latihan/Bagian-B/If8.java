public class If8 {
    public static void main(String[] args) {
        int nilai = 61;
        String status = (nilai >= 60) ? "Lulus" : "Tidak Lulus";
        System.out.println("Ternary: " + status);
        if (nilai >= 60) {
            System.out.println("If-Else: Lulus");
        } else {
            System.out.println("If-Else: Tidak Lulus");
        }
    }
}
