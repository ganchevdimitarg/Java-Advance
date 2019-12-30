package StreamsFilesAndDirectories;

import java.io.*;

public class CopyBytesLab {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";

        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(inputPath);
            out = new FileOutputStream(outputPath);

            int oneByte = in.read();

            while (oneByte >= 0) {

                if (oneByte == ' ' || oneByte == '\n') {
                    out.write(oneByte);
                } else {
                    String number = String.valueOf(oneByte);
                    for (int i = 0; i < number.length(); i++) {
                        out.write(number.charAt(i));
                    }
                }

                oneByte = in.read();
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
