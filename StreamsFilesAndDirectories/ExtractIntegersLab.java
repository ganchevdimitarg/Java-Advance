package StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegersLab {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";
        Scanner scanner = null;
        PrintWriter out = null;
        try {
            scanner = new Scanner(new FileInputStream(inputPath));
            out = new PrintWriter(new FileOutputStream(outputPath));


            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    out.println(scanner.nextInt());
                }
                scanner.next();
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
