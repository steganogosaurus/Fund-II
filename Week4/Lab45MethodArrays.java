public class Lab45MethodArrays {
    public static void showMatrix (int [][] arr) {
        for(int i = 0 ; i< arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] A = {
                     { 5, 3, 8},
                     { 2, 6, 10},
                     { 1, 8, 25},
                     { 12, 3, 30}
        };
        System.out.println("Matrix A: ");
        showMatrix(A);
        }
    }

