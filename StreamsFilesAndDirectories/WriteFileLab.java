package StreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WriteFileLab {
    public static void main(String[] args) throws IOException {
        String input = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";

        //създаваме колекция за сравняване
        List<Character> symbol = new ArrayList<>();
        Collections.addAll(symbol, '.', ',', '!', '?');
        //може и това да използваме, за да вмъкнем колекцията, тъй като няма да правим нищо с нея
//        List<Character> symbol = Arrays.asList('.', ',', '!', '?');

        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(input);
            out = new FileOutputStream(output);

            int oneByte = 0;

            while ((oneByte = in.read()) >= 0) {
                if (!symbol.contains((char) oneByte)) {
                    //тук записваме в новия файл
                    out.write(oneByte);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
