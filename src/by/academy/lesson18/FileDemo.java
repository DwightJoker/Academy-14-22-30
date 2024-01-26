package by.academy.lesson18;

import java.io.*;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        File dirs = new File("src/file/io/ab");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }
        File fileA = new File(dirs, "a.txt");

        if (!fileA.exists()) {
            fileA.createNewFile();
        }
        File fileB = new File(dirs, "b.txt");
        if (!fileB.exists()) {
            fileB.createNewFile();
        }
        try (OutputStream outputA = new FileOutputStream("src/file/io/ab/a.txt");
             InputStream inputA = new FileInputStream("src/file/io/ab/a.txt");
             OutputStream outputB = new FileOutputStream("src/file/io/ab/b.txt");
             InputStream inputB = new FileInputStream("src/file/io/ab/b.txt")) {
            char[] symbolsA = { 'q', 'w', 'e', 'r', 't', 'y'};
            for (int i = 0; i < symbolsA.length; i++) {

                outputA.write(symbolsA[i]);
            }
            int sizeA = inputA.available();
            for (int i = 0; i < sizeA; i++) {
                System.out.print((char) inputA.read() + " ");
            }
            char[] symbolsB = new char[sizeA];
            for (int i = 0; i < symbolsB.length; i++) {

                outputB.write(symbolsA[i]);
            }
            System.out.println();
            int sizeB = inputB.available();
            for (int i = 0; i < sizeB; i++) {
                System.out.print((char) inputB.read() + " ");
            }
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            System.out.print("Exception");
        }
    }
}
