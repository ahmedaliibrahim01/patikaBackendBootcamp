public class Test {
    public static void main(String[] args) {
        // Matris tanımlandı
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        // Transpozun boyutu tanımlandı
        int[][] transpose = new int[matrix[0].length][matrix.length];

        // Matris transpozu hesaplandı
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Matris ekrana bastırıldı
        System.out.println("Matris :");
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // Matrisin Transpozu ekrana bastırıldı
        System.out.println("===============");
        System.out.println("Transpoze :");
        for (int[] row : transpose) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
