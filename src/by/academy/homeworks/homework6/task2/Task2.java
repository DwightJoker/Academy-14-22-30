package by.academy.homeworks.homework6.task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {

        File dirs = new File("src/by/academy/homeworks/homework6/task2");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }
        File fileResult = new File(dirs, "resultTask2.txt");

        if (!fileResult.exists()) {
            fileResult.createNewFile();

        } try (
                BufferedReader fr = new BufferedReader(new FileReader("src/by/academy/homeworks/homework6/HomeWorkText.txt"));
                FileWriter fw = new FileWriter(fileResult, true);
        ) {
            String text = fr.readLine().replaceAll("\\s+" , "");
            fw.write(text);
            fw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}








// try (InputStream inputHWT = new FileInputStream("src/file/HomeWorkText.txt");
//         OutputStream outputResult = new FileOutputStream("src/file/result.txt");
//         InputStream inputResult = new FileInputStream("src/file/result.txt")) {
//
//
//         int sizeHWT = inputHWT.available();
//         for (int i = 0; i < sizeHWT; i++) {
//        System.out.print((char) inputHWT.read() + " ");
//        }
//        char[] symbolsResult = new char[sizeHWT];
//        for (int i = 0; i < symbolsResult.length; i++) {
//
//        outputResult.write(inputHWT.read());
//        }
//        System.out.println();
//        int sizeResult = inputResult.available();
//        for (int i = 0; i < sizeResult; i++) {
//        System.out.print((char) inputResult.read() + " ");
//        }
//        } catch (IOException | ArrayIndexOutOfBoundsException e) {
//        e.printStackTrace();
//        }