package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileLab {
    public static void main(String[] args) throws IOException {
        //записваме пътя
        String path = "C:\\Users\\Dimitar\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        InputStream in = null;
        try {
            in = new FileInputStream(path);
            //вземаме единя чар и го присвояваме
            int oneByte = in.read();
            while (oneByte >= 0){
                //превръцаме чара от в байтове
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                //четем следвация, ако няма следващ, ще върне -1
                oneByte = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null){
                in.close();
            }
        }
    }
}
