package StreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeArrayListEX {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        серелизация на лист
//        List<Double> list = new ArrayList<>();
//        list.add(4.23);
//        list.add(434.23);
//        list.add(4123.23);
//        list.add(346.23);
//
//        FileOutputStream outputStream = new FileOutputStream("list.ser");
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//
//        objectOutputStream.writeObject(list);
//        objectOutputStream.close();

        //четене на серелизиран лист
        FileInputStream inputStream = new FileInputStream("list.ser");

        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        List<Double> list = (ArrayList<Double>) objectInputStream.readObject();

        for (Double d : list) {
            System.out.println(d);
        }
    }
}
