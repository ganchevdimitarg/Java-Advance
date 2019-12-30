import java.io.*;

public class LineNumbersEX {
    public static void main(String[] args) throws IOException {
        String input = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputLineNumbers.txt";
        String output = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\OutputLineNumbers.txt";

        BufferedReader reader = null;
        PrintWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(input));
            writer = new PrintWriter(new FileWriter(output));

            String line = reader.readLine();
            int numbers = 1;
            while (line != null){

                writer.println(numbers + ". " + line);
                numbers++;
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null){
                reader.close();
            }
            if (writer != null){
                writer.close();
            }
        }
    }
}
