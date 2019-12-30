package MultidimensionalArrays;

import java.util.Scanner;

public class FillMatrixEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");
        int rowsCols = Integer.parseInt(tokens[0]);
        String pattern = tokens[1];
        int[][] matrix = new int[rowsCols][rowsCols];

        if (pattern.equals("A")) {
            for (int i = 0; i < rowsCols; i++) {
                for (int j = 0; j < rowsCols; j++) {
                    if (j == 0) {
                        matrix[i][j] = i + 1;
                    } else {
                        matrix[i][j] = matrix[i][j - 1] + rowsCols;
                    }
                }
            }
        } else {
            for (int i = 0; i < rowsCols; i++) {
                for (int j = 0; j < rowsCols; j++) {
                    if (j == 0) {
                        matrix[i][j] = i + 1;
                    } else {
                        if (j % 2 != 0) {
                            if (i == 0) {
                                matrix[i][j] = rowsCols * (j + 1);
                            } else {
                                matrix[i][j] = matrix[i - 1][j] - 1;
                            }
                        } else {
                            if (i == 0) {
                                matrix[i][j] = matrix[i][j - 1] + 1;
                            } else {
                                matrix[i][j] = matrix[i - 1][j] + 1;
                            }
                        }
                    }
                }
            }
        }

        printTheMatrix(matrix, rowsCols);

    }

    private static void printTheMatrix(int[][] matrix, int rowsCols) {
        for (int i = 0; i < rowsCols; i++) {
            for (int j = 0; j < rowsCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}