public class Main {
    public static void main(String[] args) {
        int[][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        System.out.println("<--Matris-->");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matrisinTranspozunu = new int[matris.length][matris.length];

        System.out.println("<--Matrisin Transpozunu-->");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matrisinTranspozunu[i][j] = matris[j][i];
                System.out.print(matrisinTranspozunu[i][j] + " ");
            }
            System.out.println();
        }
    }
}