package lesson_25_matrix;

import java.util.Arrays;

public class Main {

    public static void main() {
        int[][] matrix = {
                {2, 4, -1},
                {-10, 5, 11},
                {18, -8, 6},
                {18, -7, 6}
        };

        int[][] matrixTranspose = transpose(matrix);

        System.out.println("Наша матриця");
        printMatrix(matrix);
        System.out.println();
        System.out.println("Наша перевернута матриця");
        printMatrix(transpose(matrix));


    }

    public static int [][] transpose(int[][] matrix){
        int rowNumber = matrix.length;
        int colNumber = matrix[0].length;

        int[][] matrixTranspose = new int[colNumber][rowNumber];

        for (int rowIndex = 0; rowIndex < rowNumber; rowIndex++) {
            for (int colIndex = 0; colIndex < colNumber; colIndex++) {
                matrixTranspose[colIndex][rowIndex] = matrix[rowIndex][colIndex];
            }
        }
    return matrixTranspose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}



int[][] transpose(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int [][] result = new int [rows][cols];

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < result[i].length; j++) {
            result[j][i] = matrix[i][j];
        }
    }
    return result;
}

