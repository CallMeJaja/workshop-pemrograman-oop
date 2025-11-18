public class Soal5 {
    public static void main(String[] args) {
        int[][] Array2D = {
                { 10, 20, 30 },
                { 40, 50, 60 }
        };

        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[i].length; j++) {
                System.out.print(Array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
