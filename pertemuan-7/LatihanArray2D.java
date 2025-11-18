public class LatihanArray2D {
    public static void main(String[] args) {
        int[][] matriksA = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Matriks A (3x3):");
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.println();
        }
    }

}
