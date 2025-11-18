public class If3 {
    public static void main(String[] args) {
        int n = 78;
        String grade;
        if (n >= 85)
            grade = "A";
        else if (n >= 70)
            grade = "B";
        else if (n >= 60)
            grade = "C";
        else if (n >= 50)
            grade = "D";
        else
            grade = "E";
        System.out.println("Grade: " + grade);
    }
}
