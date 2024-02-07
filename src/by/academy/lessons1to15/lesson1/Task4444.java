package by.academy.lessons1to15.lesson1;

import java.io.*;

public class Task4444 {

    public static void main(String[] args) throws IOException {

        File dirs = new File("src/file/task44");
        if (!dirs.exists()) {
            dirs.mkdirs();
        }
        File result = new File("src/file/resultTask44.txt");
        if (!result.exists()) {
            result.createNewFile();
        }

        for (int i = 1; i <= 100; i++) {
            File file = new File(dirs, i + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader("src/file/HomeWorkText.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(result));
             //BufferedWriter bw1 = new BufferedWriter(new FileWriter(new File(dirs, i + ".txt")))
        ) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println("Длина текста составляет " + str.length() + " символов");
            }

            for (File f : dirs.listFiles()) {
                String x = f.getName() + " " + getRandomNumber(String.valueOf(str.length()));;
                System.out.println(x);

                //bw.write("Name: " + f.getName()+ " Size: " + f.length() + " byte" + "\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    private static int getRandomNumber(String inputText) {
        Integer y = (int)(0 + Math.random()*576);
        return y;
    }


}
