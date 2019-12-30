package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixPalindromesEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = tokens[0];
        int cols = tokens[1];
        String[][] matrix = new String[rows][cols];
        int firstLetter = 97;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String chars = (char)(firstLetter + row) + "";
                chars += (char)(firstLetter + col + row) + "";
                chars += (char)(firstLetter + row) + "";
                matrix[row][col] = chars;
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
