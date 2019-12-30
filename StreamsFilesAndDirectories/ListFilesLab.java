package StreamsFilesAndDirectories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ListFilesLab {
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        String outputFileName = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\07.listfile.txt";

        File folderToRead = new File(inputFileName);
        PrintWriter out = null;

        try {
            out = new PrintWriter(outputFileName);

            //взема всички файлове в него
            File[] files = folderToRead.listFiles();

            for (File file : files) {
                if (!file.isDirectory()) {
                    out.printf("%s: [%d]%n", file.getName(), file.length());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null){
                out.close();
            }
        }
    }
}
