package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShufflingEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsCols[0];
        int cols = rowsCols[1];
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }

        String[] tokens = scanner.nextLine().split("\\s+");
        while (!tokens[0].equals("END")) {
            if (tokens.length < 5 || tokens.length > 5 ||
                    (Integer.parseInt(tokens[1]) > rows || Integer.parseInt(tokens[2]) > rows ||
                            Integer.parseInt(tokens[3]) > cols || Integer.parseInt(tokens[4]) > cols)) {
                System.out.println("Invalid input!");
                tokens = scanner.nextLine().split("\\s+");
                continue;
            }
            int rowIndexFirst = Integer.parseInt(tokens[1]);
            int colIndexFirst = Integer.parseInt(tokens[2]);
            int rowIndexSecond = Integer.parseInt(tokens[3]);
            int colIndexSecond = Integer.parseInt(tokens[4]);
            if (tokens[0].equals("swap")) {
                String firstDigit = matrix[rowIndexFirst][colIndexFirst];
                String secondDigit = matrix[rowIndexSecond][colIndexSecond];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        if (i == rowIndexFirst && j == colIndexFirst) {
                            matrix[rowIndexFirst][colIndexFirst] = secondDigit + "";
                        } else if (i == rowIndexSecond && j == colIndexSecond) {
                            matrix[rowIndexSecond][colIndexSecond] = firstDigit + "";
                        }
                    }
                }
                printMatrix(rows, cols, matrix);
            }
            tokens = scanner.nextLine().split("\\s+");
        }
    }

    private static void printMatrix(int rows, int cols, String[][] matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

