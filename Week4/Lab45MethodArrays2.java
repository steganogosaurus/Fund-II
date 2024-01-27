public class Lab45MethodArrays2 {
    public static void showMatrix (int[][] matrix) {
        for(int i = 0 ; i< matrix.length;i++){
            for(int j = 0; j< matrix[i].length;j++){
                System.out.printf("%5d",matrix[i][j]);
            }
            System.out.println("");
        }
    }
    public static void showAddMatrix (int[][] matrixA,int[][]matrixB){
        int rows = 2,columns = 3;
        int matrixPlus[][]=new int[rows][columns];
        for(int i = 0 ; i< rows;i++){
            for(int j = 0; j< columns;j++){
                matrixPlus[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.printf("%5d",matrixPlus[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] A = {
                      { -3, 5, 6},
                      { 5, 0, -2}
        };
        int[][] B = {
                     { 9, 0, -5},
                     { -3, -2, -1}
        };
        System.out.println("Matrix A: ");
        showMatrix(A);
        System.out.println("Matrix B: ");
        showMatrix(A);
        System.out.println("Matrix A+B: ");
        showAddMatrix(A,B);
        }
    }

