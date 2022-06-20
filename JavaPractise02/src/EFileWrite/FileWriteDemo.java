package EFileWrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("apple.text");
        fw.write("ÄãºÃ£¬ÔÙ¼û");
        fw.flush();
        fw.close();
    }
}
