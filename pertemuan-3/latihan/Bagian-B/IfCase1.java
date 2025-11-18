public class IfCase1 {
    public static void main(String[] args) {
        int nilai = 83;
        String grade;
        if (nilai >= 85)
            grade = "A";
        else if (nilai >= 70)
            grade = "B";
        else if (nilai >= 60)
            grade = "C";
        else if (nilai >= 50)
            grade = "D";
        else
            grade = "E";

        String status = (nilai >= 60) ? "Lulus" : "Tidak Lulus";
        System.out.println("Nilai: " + nilai + ", Grade: " + grade + ", Status: " + status);
    }
}
