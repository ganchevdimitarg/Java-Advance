package StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SumLinesEX {
    public static void main(String[] args) throws IOException {

        String input = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";

        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get(input));


            String lines = reader.readLine();
            while (lines != null) {
                long sum = 0;
                for (int i = 0; i < lines.length(); i++) {
                    sum += lines.charAt(i);
                }
//                може и по този начин
//                for (char line : lines.toCharArray()) {
//                    sum += line;
//                }
                System.out.println(sum);
                lines = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader != null){
                reader.close();
            }
        }
    }
}
