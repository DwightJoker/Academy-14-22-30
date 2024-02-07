package by.academy.homeworks.homework6.task1;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws IOException {

        File dirs = new File("src/by/academy/homeworks/homework6/task1");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }
        File task1 = new File(dirs, "resultTask1.txt");

        if (!task1.exists()) {
            task1.createNewFile();
        }

        Scanner sc = new Scanner(System.in);

        try (
                FileWriter fw = new FileWriter(task1, true)
        ) {
            System.out.println("Введите текст: ");
            for(; ;){
                String text = sc.next();
                if (!text.equals("stop")) {
                    fw.write(text + " ");
                } else {
                    fw.close();
                    System.out.println("Ввод завершен");
                    sc.close();
                    break;

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
