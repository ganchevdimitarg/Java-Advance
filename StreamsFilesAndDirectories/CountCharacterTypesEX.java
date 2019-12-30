import java.io.*;
import java.util.Scanner;

public class CountCharacterTypesEX {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
        String output = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\CCTE.txt";

        BufferedReader reader = null;
        PrintWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(input));
            writer = new PrintWriter(new FileWriter(output));

            String lines = reader.readLine();
            int countVowels = 0;
            int countConsonants = 0;
            int countPunctuation = 0;
            while (lines != null) {
                for (char c : lines.toCharArray()) {
                    switch (c) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            countVowels++;
                            break;
                        case '!':
                        case '.':
                        case ',':
                        case '?':
                            countPunctuation++;
                            break;
                        case ' ':
                            break;
                        default:
                            countConsonants++;
                            break;
                    }
                }
                lines = reader.readLine();
            }

            writer.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d%n", countVowels, countConsonants, countPunctuation);
            writer.flush();

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
