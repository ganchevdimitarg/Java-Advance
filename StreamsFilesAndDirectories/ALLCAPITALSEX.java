import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class ALLCAPITALSEX {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
        String output = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt";

        BufferedReader reader = null;
        PrintWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(input));
            writer = new PrintWriter(new FileWriter(output));

            String lines = reader.readLine();
            while (lines != null) {

                writer.println(lines.toUpperCase());
                writer.flush();
                lines = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                reader.close();
            }
        }
    }
}
