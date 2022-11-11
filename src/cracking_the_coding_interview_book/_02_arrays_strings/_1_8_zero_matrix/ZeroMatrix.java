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
        //setZeros(numbers);
        setZeros2(numbers);
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

    private static void setZeros2(int[][] matrix) {
        boolean rowHasZero = false;
        boolean columnHasZero = false;

        // first row has a zero???
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                rowHasZero = true;
                break;
            }
        }

        // first column has a zero???
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                columnHasZero = true;
                break;
            }
        }

        // check zeros rest of the array
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) nullifyRow(matrix, i);
        }

        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) nullifyColumn(matrix, j);
        }

        if (rowHasZero) {
            nullifyRow(matrix, 0);
        }

        if (columnHasZero) {
            nullifyColumn(matrix, 0);
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
