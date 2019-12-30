package Generics.JarToT;

import java.util.Scanner;
import Generics.JarToT.Jar;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jar<String> jar = new Jar<>();


        jar.add("first");
        jar.add("second");

        System.out.println(jar.remove());


    }
}
