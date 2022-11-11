package cracking_the_coding_interview_book._02_arrays_strings._1_8_zero_matrix;

public class ZeroMatrix {

    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 0;
        numbers[1][2] = 6;
        numbers[2][0] = 7;
        numbers[2][1] = 8;
        numbers[2][2] = 9;

        printMatrix(numbers);
        setZeros(numbers);
        printMatrix(numbers);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void setZeros(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        // store the row and column index with value 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // nullify rows
        for (int i = 0; i < row.length; i++) {
            if (row[i]) nullifyRow(matrix, i);
        }

        for (int j = 0; j < row.length; j++) {
            if (column[j]) nullifyColumn(matrix, j);
        }
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }

    private static void nullifyColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }
}
