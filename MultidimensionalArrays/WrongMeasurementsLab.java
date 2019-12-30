package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurementsLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] inputMatrix = new int[n][];

        for (int i = 0; i < n; i++) {
            int[] row = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            inputMatrix[i] = row;
        }
        int[] cordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int x = cordinates[0];
        int y = cordinates[1];

        int wrongValue = inputMatrix[x][y];
        int[][] resultMatrix = new int[n][];

        for (int i = 0; i < n; i++) {
            resultMatrix[i] = inputMatrix[i].clone();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                if (resultMatrix[i][j] == wrongValue) {
                    resultMatrix[i][j] = getSum(inputMatrix, i, j, wrongValue);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getSum(int[][] matrix, int row, int col, int wrongValue) {
        int sum = 0;

        if (row - 1 >= 0 && matrix[row - 1][col] != wrongValue) {
            sum += matrix[row - 1][col];
        }

        if (row + 1 < matrix.length && matrix[row + 1][col] != wrongValue) {
            sum += matrix[row + 1][col];
        }

        if (col - 1 >= 0 && matrix[row][col - 1] != wrongValue) {
            sum += matrix[row][col - 1];
        }

        if (col + 1 < matrix[row].length && matrix[row][col + 1] != wrongValue) {
            sum += matrix[row][col + 1];
        }

        return sum;
    }
}
