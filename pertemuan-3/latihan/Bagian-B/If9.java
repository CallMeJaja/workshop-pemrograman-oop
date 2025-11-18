public class If9 {
    public static void main(String[] args) {
        int usia = 16;
        String kategori;
        if (usia < 12)
            kategori = "Anak";
        else if (usia <= 17)
            kategori = "Remaja";
        else if (usia <= 59)
            kategori = "Dewasa";
        else
            kategori = "Lansia";
        System.out.println("Kategori: " + kategori);
    }
}
