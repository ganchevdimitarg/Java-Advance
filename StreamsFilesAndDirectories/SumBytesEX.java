import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SumBytesEX {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";

        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get(input));

            long sum = 0;
            String lines = reader.readLine();
            while (lines != null) {

//                for (int i = 0; i < lines.length(); i++) {
//                    sum += lines.charAt(i);
//                }
//                може и по този начин
                for (char line : lines.toCharArray()) {
                    sum += line;
                }
                lines = reader.readLine();
            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null){
                reader.close();
            }
        }


    }
}
