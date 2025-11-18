public class Loop6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            String line = "";
            for (int j = 1; j <= i; j++)
                line += "*";
            System.out.println(line);
        }
    }
}