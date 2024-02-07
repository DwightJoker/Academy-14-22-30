package by.academy.homeworks.homework6.task4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) throws IOException {

        List<String> fileNameWithSizeList = new ArrayList<>();

        String homeWorkText = readFileText();

        File dirs = new File("src/by/academy/homeworks/homework6/task4/task4txt/");
        if (!dirs.exists()) {
            dirs.mkdirs();
        }

        for (int i = 1; i <= 100; i++) {

            String fileName = String.format("%d.txt", i);
            String fileNameWithPath = String.format("%s%s", "src/by/academy/homeworks/homework6/task4/task4txt/", fileName);
            String substringWithRandomSize = homeWorkText.substring(0, getRandomNumber(homeWorkText));

            FileWriter newFile = new FileWriter(fileNameWithPath);
            newFile.write(substringWithRandomSize);
            newFile.close();
            File someFile = new File(fileNameWithPath);

            fileNameWithSizeList.add(String.format("%s %d", fileName,someFile.length()));
        }


            saveResult(fileNameWithSizeList);
            System.out.println("The result has been successfully saved to the file result.txt");
        }

        private static String readFileText() throws IOException {

        Path file = Paths.get("src/by/academy/homeworks/homework6/HomeWorkText.txt");
        return new String(Files.readAllBytes(file));
        }

        private static int getRandomNumber(String inputText) {
            Random random = new Random();
            return random.ints(1, inputText.length()).findFirst().getAsInt();
        }

        private static void saveResult(List<String> fileNameWithSizeList) throws IOException {
            Path file = Paths.get("src/by/academy/homeworks/homework6/task4/resultTask4.txt");
            Files.write(file, fileNameWithSizeList);


        }
    }

