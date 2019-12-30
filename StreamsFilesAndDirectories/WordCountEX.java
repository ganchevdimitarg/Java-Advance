import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordCountEX {
    public static void main(String[] args) throws IOException {
        String inputWords = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\words.txt";
        String inputText = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\text.txt";
        String output = "C:\\Users\\ThinkCentre\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\WordCountOutput.txt";

        BufferedReader words = null;
        BufferedReader text = null;
        PrintWriter writer = null;

        Map<String, Integer> machas = new HashMap<>();

        try {
            words = new BufferedReader(new FileReader(inputWords));
            text = new BufferedReader(new FileReader(inputText));
            writer = new PrintWriter(new FileWriter(output));

            String token = words.readLine();
            String[] word = token.split(" ");

            for (String w : word) {
                machas.putIfAbsent(w, 0);
            }

            while (token != null) {
                String line = text.readLine();
                String[] lineWord = line.split("[., ]");
                for (String wordMacher : word) {
                    for (String wordLine : lineWord) {
                        if (wordMacher.equals(wordLine)) {
                            machas.put(wordMacher, machas.get(wordMacher) + 1);
                        }
                    }
                }
                token = text.readLine();
            }

            machas.entrySet().stream().sorted((k1, k2) -> Integer.compare(k2.getValue(), k1.getValue()));
            writer.println(machas);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (words != null) {
                words.close();
            }
            if (text != null) {
                text.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
