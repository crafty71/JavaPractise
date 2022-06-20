package QObjectStream;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream out = new ObjectInputStream(new FileInputStream("JavaPractise02\\ copy01.txt"));
        Student s = (Student)out.readObject();
        System.out.println(s);
    }

    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaPractise02\\ copy01.txt"));

        Student s = new Student("coderwhy", 20);

        oos.writeObject(s);

        oos.close();
    }
}
