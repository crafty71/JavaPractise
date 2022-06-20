package CCopyText;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyText {
    public static void main(String[] args) throws IOException {
//        字节输入流
        FileInputStream fis = null;
//        字节输出流
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\crash\\apple.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fos = new FileOutputStream("JavaPractise02\\ apple.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int by;
//        while (true) {
//            assert fis != null;
//            if ((by = fis.read()) == -1) break;
//            assert fos != null;
//            fos.write(by);
//        }
        int ch = 0;
        while(true) {
            assert fis != null;
            if ((ch = fis.read()) == -1) break;
            assert fos != null;
            fos.write(ch);
        }
        assert fos != null;
        fos.close();
        fis.close();
    }
}
