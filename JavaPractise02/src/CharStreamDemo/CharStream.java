package CharStreamDemo;


import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CharStream {
    public static void main(String[] args) throws IOException {
        writeText();
        readText();
    }

    private static void readText() throws IOException {
        FileReader fr = new FileReader("apple.text");
        int ch;
        while((ch = fr.read()) != -1) {
            System.out.println(ch);
            System.out.println((char)ch);
        }
        fr.close();
    }

    private static void writeText() throws IOException {
        FileOutputStream fos = new FileOutputStream("apple.text");
        fos.write("Æ»¹û".getBytes());
        fos.close();
    }
}
