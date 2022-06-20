package RPrintWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWRiterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("copy02.txt"), true);

        for(int i = 0 ; i <= 5; i++) {
            out.println("hello world");
        }
        out.close();
    }
}

//    IO流总结
//            字节流
//    字节输入流 InputStream
//    FileInputStream 操作文件的字节输入流
//BufferedInputStream高效的字节输入流
//        ObjectInputStream 反序列化流
//        字节输出流 OutputStram
//        FileOutputStream 操作文件的字节输出流
//        BufferedOutputStream 高效的字节输出流
//        ObjectOuputStream 序列化流
//        PrintStream 字节打印流
//        字符流
//        字符输入流 Reader
//        FileReader 操作文件的字符输入流
//        BufferedReader 高效的字符输入流
//        InputStreamReader 输入操作的转换流(把字节流封装成字符流)
//        字符输出流 Writer
//        FileWriter 操作文件的字符输出流
//        BufferedWriter 高效的字符输出流
//        OutputStreamWriter 输出操作的转换流(把字节流封装成字符流)
//        PrintWriter 字符打印流
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
//
//        File类
//        方法
//        获取文件名称	getName()
//        获取文件绝对路径	getAbsolutePath()
//        获取文件大小	length()
//        获取当前文件夹中所有File对象  File[] listFiles()
//        判断是否为文件	isFile()
//        判断是否为文件夹	isDirectory()
//        创建文件夹	mkdir()  mkdirs()
//        创建文件	createNewFile()
//
//        异常
//        try..catch…finally捕获处理异常
//        throws 声明异常
//        throw 抛出异常对象
//
//        异常的分类
//        编译期异常 Exception
//        |- 运行期异常 RuntimeException
//
//        注意：
//        编译期异常，必须处理，不然无法编译通过
//        运行期异常，程序运行过程中，产生的异常信息
//
//        Properties：Map集合的一种，它是Hashtable集合的子集合,它键与值都是String类型,它是唯一能与IO流结合使用的集合
//        方法
//        load( InputStream in ) 从流所对应的文件中，读数据到集合中
//        load( Reader in ) 从流所对应的文件中，读数据到集合中
//        store( OutputStream out , String message ) 把集合中的数据，写入到流所对应的文件中
//        store( Writer out , String message) 把集合中的数据，写入到流所对应的文件中
//
//        实现文件内容的自动追加
//        构造方法
//        FileOutputStream(File file, boolean append)
//        FileOutputStream(String fileName, boolean append)
//        FileWriter(File, boolean append)
//        FileWriter(String fileName, boolean append)
//        实现文件内容的自动刷新
//        构造方法
//        PrintStream(OutputStream out, boolean autoFlush)
//        PrintWriter(OutputStream out, boolean autoFlush)
//        PrintWriter(Writer out, boolean autoFlush)
//
//        Commons-IO
//        方法
//        readFileToString(File file)：读取文件内容，并返回一个String；
//        writeStringToFile(File file，String content)：将内容content写入到file中；
//        copyDirectoryToDirectory(File srcDir,File destDir);文件夹复制
//        copyFileToDirectory (File srcFile,File destFile);文件复制



