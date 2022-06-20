package NBufferWrirer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class nBufferWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("JavaPractise02\\ copy01.txt"));

        for(int i = 0; i < 6; i++) {
            out.write("hello");
            out.newLine();
        }
        out.close();
    }
}
