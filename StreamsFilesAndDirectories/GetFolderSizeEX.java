package StreamsFilesAndDirectories;

import java.io.*;
import java.util.Arrays;

public class GetFolderSizeEX {
    public static void main(String[] args) throws IOException {
        String inputOne = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        String output = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\GetFolderSize.txt";

        File one = null;
        PrintWriter writer = null;

        try {
            one = new File(inputOne);
            writer = new PrintWriter(new FileWriter(output));

            long sum = Arrays.stream(one.listFiles())
                    .filter(e -> !e.isDirectory()).mapToLong(e -> e.length()).sum();

            writer.println("Folder size: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
