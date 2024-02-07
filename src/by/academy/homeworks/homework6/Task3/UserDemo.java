package by.academy.homeworks.homework6.Task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDemo {
    public static void main(String[] args) throws IOException {
        List<User> users = new ArrayList<>(10);

        users.add(new User("Jane", "Lane", 33));
        users.add(new User("Mary", "Jane", 12));
        users.add(new User("Jerry", "Mane", 3));
        users.add(new User("Lary", "Zane", 56));
        users.add(new User("Zane", "Okko", 111));
        users.add(new User("Trane", "Star", 43));
        users.add(new User("Gane", "Rock", 22));
        users.add(new User("Fane", "Alad", 66));
        users.add(new User("Annet", "Lada", 99));
        users.add(new User("Tanos", "Olol", 34));

        File dirs = new File("src/by/academy/homeworks/homework6/task3/users");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }
        for (int i = 0; i <10; i++) {
            File file = new File(dirs, users.get(0 + i) + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            try (ObjectOutputStream oos0 = new ObjectOutputStream(new FileOutputStream(file));)
            {

            oos0.writeObject(0 + i);
            oos0.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            }
        }
        System.out.println("Serialized files in: src/by/academy/homeworks/homework6/task3/users");

//        File user0 = new File(dirs, String.valueOf(users.get(0))+".txt");
//
//        if (!user0.exists()) {
//            user0.createNewFile();
//        }
//        File user1 = new File(dirs, String.valueOf(users.get(1))+".txt");
//
//        if (!user1.exists()) {
//            user1.createNewFile();
//        }
//        File user2 = new File(dirs, String.valueOf(users.get(2))+".txt");
//
//        if (!user2.exists()) {
//            user2.createNewFile();
//        }
//        File user3 = new File(dirs, String.valueOf(users.get(3))+".txt");
//
//        if (!user3.exists()) {
//            user3.createNewFile();
//        }
//        File user4 = new File(dirs, String.valueOf(users.get(4))+".txt");
//
//        if (!user4.exists()) {
//            user4.createNewFile();
//        }
//        File user5 = new File(dirs, String.valueOf(users.get(5))+".txt");
//
//        if (!user5.exists()) {
//            user5.createNewFile();
//        }
//        File user6 = new File(dirs, String.valueOf(users.get(6))+".txt");
//
//        if (!user6.exists()) {
//            user6.createNewFile();
//        }
//        File user7 = new File(dirs, String.valueOf(users.get(7))+".txt");
//
//        if (!user7.exists()) {
//            user7.createNewFile();
//        }
//        File user8 = new File(dirs, String.valueOf(users.get(8))+".txt");
//
//        if (!user8.exists()) {
//            user8.createNewFile();
//        }
//        File user9 = new File(dirs, String.valueOf(users.get(9))+".txt");
//
//        if (!user9.exists()) {
//            user9.createNewFile();
//        }

//
//        try (ObjectOutputStream oos0 = new ObjectOutputStream(new FileOutputStream(user0));
//             ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(user1));
//             ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(user2));
//             ObjectOutputStream oos3 = new ObjectOutputStream(new FileOutputStream(user3));
//             ObjectOutputStream oos4 = new ObjectOutputStream(new FileOutputStream(user4));
//             ObjectOutputStream oos5 = new ObjectOutputStream(new FileOutputStream(user5));
//             ObjectOutputStream oos6 = new ObjectOutputStream(new FileOutputStream(user6));
//             ObjectOutputStream oos7 = new ObjectOutputStream(new FileOutputStream(user7));
//             ObjectOutputStream oos8 = new ObjectOutputStream(new FileOutputStream(user8));
//             ObjectOutputStream oos9 = new ObjectOutputStream(new FileOutputStream(user9));
//        ) {
//
//            oos0.writeObject(0);
//            oos0.close();
//            oos1.writeObject(1);
//            oos1.close();
//            oos2.writeObject(2);
//            oos2.close();
//            oos3.writeObject(3);
//            oos3.close();
//            oos4.writeObject(4);
//            oos4.close();
//            oos5.writeObject(5);
//            oos5.close();
//            oos6.writeObject(6);
//            oos6.close();
//            oos7.writeObject(7);
//            oos7.close();
//            oos8.writeObject(8);
//            oos8.close();
//            oos9.writeObject(9);
//            oos9.close();
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }

    }
}
