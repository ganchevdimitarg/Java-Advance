package StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortLinesLab {
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\6input.txt";
        String outputFileName= "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt";

        Path inputPath = Paths.get(inputFileName);
        Path outputPath = Paths.get(outputFileName);

        try {
            //чете всички линии и ги добавя в листа
            List<String> allLines = Files.readAllLines(inputPath);
            //подрежда колекцята
            Collections.sort(allLines);

            //записва всички редове
            Files.write(outputPath, allLines);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
