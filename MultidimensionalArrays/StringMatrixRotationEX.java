package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotationEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split("[()]+");
        int rotateAngel = Integer.parseInt(string[1]) % 360;
        List<String> inputString = new ArrayList<>();

        String line = scanner.nextLine();

        int maxLeight = line.length();
        while (!line.equals("END")) {
            inputString.add(line);
            line = scanner.nextLine();
            if (maxLeight < line.length()) {
                maxLeight = line.length();
            }
        }
        char[][] matrix = new char[inputString.size()][maxLeight];

        for (int r = 0; r < inputString.size(); r++) {
            for (int c = 0; c < maxLeight; c++) {
                if (c > inputString.get(r).length() - 1) {
                    matrix[r][c] = ' ';
                } else {
                    matrix[r][c] = inputString.get(r).charAt(c);
                }
            }
        }
        switch (rotateAngel) {
            case 90:
                for (int c = 0; c < maxLeight; c++) {
                    for (int r = matrix.length - 1; r >= 0; r--) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int r = matrix.length - 1; r >= 0; r--) {
                    for (int c = maxLeight - 1; c >= 0; c--) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int c = maxLeight - 1; c >= 0; c--) {
                    for (int r = 0; r < matrix.length; r++) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            default:
                for (int r = 0; r < matrix.length; r++) {
                    for (int c = 0; c < maxLeight; c++) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;

        }
    }
}
