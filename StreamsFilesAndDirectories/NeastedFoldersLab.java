package StreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;

public class NeastedFoldersLab {
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        String outputFileName = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\08.NeastedFolders.txt";

        PrintWriter out = null;
        File folderToRead = new File(inputFileName);
        int count = 0;

        try {
            out = new PrintWriter(new FileWriter(outputFileName));

            //взема първата деректория с всичките и неща
            ArrayDeque<File> filesToFound = new ArrayDeque<>(Arrays.asList(folderToRead));

            while (!filesToFound.isEmpty()) {
                File currentFile = filesToFound.poll();
                if (currentFile.isDirectory()) {
                    count++;
                    filesToFound.addAll(Arrays.asList(currentFile.listFiles()));
                    out.println(currentFile.getName());
                }
            }
            out.println(count + " folders");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
