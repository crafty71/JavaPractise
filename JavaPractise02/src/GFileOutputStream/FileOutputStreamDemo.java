package GFileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs = new FileOutputStream("JavaPractise02\\ write.txt");
        OutputStreamWriter ows = new OutputStreamWriter(fs, StandardCharsets.UTF_8);
        ows.write("你好，再见");
        ows.close();
    }
}
