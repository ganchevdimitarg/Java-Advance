//package MultidimensionalArrays;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class CompareMatricesLab {
//    public static void main(String[] args) {
//
//       int[][] firstMatrix = upgradeMatrix();
//       int[][] secondMatrix = upgradeMatrix();
//
//        if (firstMatrix.length != secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length) {
//            System.out.println("not equal");
//            return;
//        }
//        for (int row = 0; row < firstMatrix.length; row++) {
//            for (int colum = 0; colum < secondMatrix[0].length; colum++) {
//                if (firstMatrix[row][colum] != secondMatrix[row][colum]) {
//                    System.out.println("not equal");
//                    return;
//                }
//            }
//        }
//        System.out.println("equal");
//    }
//
//    private static int[][] upgradeMatrix() {
//        Scanner scanner = new Scanner(System.in);
//        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        int rows = tokens[0];
//        int cols = tokens[1];
//        int[][] matrix = new int[rows][cols];
//
//        for (int row = 0; row < rows; row++) {
//            int[] numbersFirst = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//            for (int colum = 0; colum < cols; colum++) {
//                matrix[row][colum] = numbersFirst[colum];
//            }
//        }
//
//        return matrix;
//    }
//}
