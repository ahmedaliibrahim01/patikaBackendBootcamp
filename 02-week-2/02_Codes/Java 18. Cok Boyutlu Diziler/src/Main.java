public class Main {
    public static void main(String[] args) {
        int[][] matris ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        for (int[] row : matris){
            for (int col : row){
                System.out.print(col + ", ");
            }
            System.out.println();
        }
    }
}