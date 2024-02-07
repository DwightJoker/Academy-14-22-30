package by.academy.lessons16to30.lesson19;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserSerializerDemo {

    public static void main(String[] args) throws IOException {
        User u1 = new User();

        u1.setId(1l);
        u1.setLogin("superuser1");
        u1.setPassword("qwerty");

        File users = new File("src/file/io/ab/users.txt");
        if(!users.exists()) {
            users.createNewFile();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(users))) {

            oos.writeInt(1);

            oos.writeObject(u1);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
