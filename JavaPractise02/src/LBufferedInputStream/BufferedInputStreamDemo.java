package LBufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        read();
    }

    private static void read() throws IOException {
        FileInputStream fin = new FileInputStream("JavaPractise02\\ demo.txt");

        BufferedInputStream in = new BufferedInputStream(fin);

        int ch;

        while( (ch = in.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}
