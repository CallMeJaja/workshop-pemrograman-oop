public class If6 {
    public static void main(String[] args) {
        String kode = "TRPL";
        switch (kode) {
            case "TRPL":
                System.out.println("Teknologi Rekayasa Perangkat Lunak");
                break;
            case "TM":
                System.out.println("Teknik Mesin");
                break;
            default:
                System.out.println("Program studi tidak dikenali.");
                break;
        }
    }
}
