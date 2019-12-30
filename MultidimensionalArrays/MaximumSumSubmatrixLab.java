package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumSubmatrixLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsCols[0]);
        int cols = Integer.parseInt(rowsCols[1]);
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = numbers;
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRos = -1;
        int maxCol = -1;
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                int currentSum = sumFromtopLeft(matrix, i, j);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxRos = i;
                    maxCol = j;
                }
            }
        }

        System.out.printf("%d %d%n%d %d%n%d", matrix[maxRos][maxCol],
                matrix[maxRos][maxCol + 1],
                matrix[maxRos + 1][maxCol],
                matrix[maxRos + 1][maxCol + 1], maxSum);

    }

    private static int sumFromtopLeft(int[][] matrix, int row, int col) {
        return matrix[row][col] + matrix[row + 1][col] +
                matrix[row][col + 1] + matrix[row + 1][col + 1];
    }
}
