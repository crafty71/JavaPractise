package KBufferOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        write();
    }

    private static void write() throws IOException {
        FileOutputStream fs = new FileOutputStream("JavaPractise02\\ demo.txt");

        BufferedOutputStream out = new BufferedOutputStream(fs);

        out.write("hello world".getBytes(StandardCharsets.UTF_8));

        out.close();
    }

}
