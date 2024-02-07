package by.academy.lessons16to30.lesson19;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> journal = new HashMap<>();
        journal.put("Vasya", 5);
        journal.put("Petya", 4);
        journal.put("Kolya", 3);

        File file = new File("src/file/io/ab/journal.txt");
        if(!file.exists()) {
            file.createNewFile();
        }

        try (BufferedWriter fw = new BufferedWriter(new FileWriter(file, true));
             BufferedReader fr = new BufferedReader(new FileReader(file)))
        {
            for(String key : journal.keySet()) {
                fw.write(key + " +- " + journal.get(key) + "\n");
            }

            fw.flush();
            fw.close();

            String s;
            while((s = fr.readLine()) !=null) {
                System.out.println(s);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
