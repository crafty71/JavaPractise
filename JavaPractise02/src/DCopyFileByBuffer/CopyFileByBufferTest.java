package DCopyFileByBuffer;

import java.io.*;

public class CopyFileByBufferTest {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:\\crash\\apple.txt");
        File destFile = new File("copy.text");

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

//        ¶¨Òå»º³åÇø
        byte[] buf = new byte[1024];
        int len = 0;
        while( (len = fis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        fos.close();
        fis.close();
    }
}
