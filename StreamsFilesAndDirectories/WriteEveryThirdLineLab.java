package StreamsFilesAndDirectories;

import java.io.*;

public class WriteEveryThirdLineLab {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";

        BufferedReader in = null;
        PrintWriter out = null;
        int row = 1;
        try {
            in = new BufferedReader(new FileReader(inputPath));
            out = new PrintWriter(new FileWriter(outputPath));


            String line = in.readLine();
            while (line != null){
                if (row % 3 == 0){
                    out.println(line);
                }
                row++;
                line = in.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
