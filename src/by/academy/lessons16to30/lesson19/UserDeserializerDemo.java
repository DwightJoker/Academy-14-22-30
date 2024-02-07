package by.academy.lessons16to30.lesson19;

import com.sun.nio.sctp.IllegalUnbindException;

import java.io.*;

public class UserDeserializerDemo {

    public static void main(String[] args) throws IOException {
        File users = new File("src/file/io/ab/users.txt");
        if(!users.exists()) {
            users.createNewFile();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(users))) {

            int i = ois.readInt();

            User u1 = (User) ois.readObject();

            System.out.println(i);
            System.out.println(u1);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
