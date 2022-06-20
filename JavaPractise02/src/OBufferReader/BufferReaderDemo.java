package OBufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("JavaPractise02\\ copy.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }

        in.close();
    }
}
//    知识点总结
//            字节流
//    字节输入流 InputStream
//    FileInputStream 操作文件的字节输入流
//BufferedInputStream高效的字节输入流
//        字节输出流 OutputStream
//        FileOutputStream 操作文件的字节输出流
//        BufferedOutputStream 高效的字节输出流
//        字符流
//        字符输入流 Reader
//        FileReader 操作文件的字符输入流
//        BufferedReader 高效的字符输入流
//        InputStreamReader 输入操作的转换流(把字节流封装成字符流)
//        字符输出流 Writer
//        FileWriter 操作文件的字符输出流
//        BufferedWriter 高效的字符输出流
//        OutputStreamWriter 输出操作的转换流(把字节流封装成字符流)
//
//        方法：
//        读数据方法：
//        read() 一次读一个字节或字符的方法
//        read(byte[]  char[]) 一次读一个数组数据的方法
//        readLine() 一次读一行字符串的方法(BufferedReader类特有方法)
//        readObject() 从流中读取对象(ObjectInputStream特有方法)
//        写数据方法：
//        write(int) 一次写一个字节或字符到文件中
//        write(byte[] char[]) 一次写一个数组数据到文件中
//        write(String) 一次写一个字符串内容到文件中
//        writeObject(Object ) 写对象到流中(ObjectOutputStream类特有方法)
//        newLine() 写一个换行符号(BufferedWriter类特有方法)
//
//        向文件中写入数据的过程
//        1，创建输出流对象
//        2，写数据到文件
//        3，关闭输出流
//        从文件中读数据的过程
//        创建输入流对象
//        从文件中读数据
//        关闭输入流
//
//        文件复制的过程
//        创建输入流（数据源）
//        创建输出流（目的地）
//        从输入流中读数据
//        通过输出流，把数据写入目的地
//        关闭流
