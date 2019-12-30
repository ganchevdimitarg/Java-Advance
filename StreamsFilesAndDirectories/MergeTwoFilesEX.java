import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoFilesEX {
    public static void main(String[] args) throws IOException {
        String inputOne = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputOne.txt";
        String inputTwo = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputTwo.txt";
        String output = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\MergeFilesOutput.txt";

        BufferedReader one = null;
        BufferedReader two = null;
        PrintWriter writer = null;

        try {
            one = new BufferedReader(new FileReader(inputOne));
            two = new BufferedReader(new FileReader(inputTwo));
            writer = new PrintWriter(new FileWriter(output));

            String lineOne = one.readLine();
            putTheWordsInOneFile(lineOne, writer, one);

            String lineTwo = two.readLine();
            putTheWordsInOneFile(lineTwo, writer, two);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (one != null) {
                one.close();
            }
            if (two != null) {
                two.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }

    private static void putTheWordsInOneFile(String line, PrintWriter writer, BufferedReader one) throws IOException {
        while (line != null){
            writer.println(line);
            line = one.readLine();
        }
    }
}
