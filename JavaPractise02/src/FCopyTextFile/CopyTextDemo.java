package FCopyTextFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//IO流的分类
//        |- 字节流
//        |- 字节输入流 InputStream 抽象类
//        |-  FileInputStream 操作文件的字节输入流
//        |- 字节输出流 OuputStream抽象类
//        |- FileOutputStream 操作文件的字节输出流
//        |- 字符流
//        |- 字符输入流 Reader抽象类
//        |- InputStreamReader 输入操作的转换流
//        |- FileReader 用来操作文件的字符输入流（简便的流）
//        |- 字符输出流 Writer抽象类
//        |- OutputStreamWriter 输出操作的转换流
//        |- FileWriter 用来操作文件的字符输出流（简便的流）

public class CopyTextDemo {
    public static void main(String[] args) throws IOException {
        copyTextFile();
    }

    private static void copyTextFile() throws IOException {
        FileReader fr = new FileReader("JavaPractise02\\ apple.txt");
        FileWriter fw = new FileWriter("copyable.txt");

        char[] buf = new char[1024];
        int len;
        while((len = fr.read(buf)) != -1) {
            fw.write(buf, 0 ,len);
        }
        fw.close();
        fr.close();
    }
}
