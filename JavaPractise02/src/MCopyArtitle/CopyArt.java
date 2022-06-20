package MCopyArtitle;

import java.io.*;

public class CopyArt {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        String src = "article.txt";
        String dest = "JavaPractise02\\ copy.txt";
//        methods01(src, dest); // 350
//        methods02(src, dest); // 3
//        methods03(src, dest); // 11
        methods04(src, dest); // 3
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
    }

    private static void methods04(String src, String dest) throws IOException {
        //        指定数据源
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
//        指定目的地
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
        // 读数据
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }
        in.close();
        out.close();
    }

    private static void methods03(String src, String dest) throws IOException {
//        指定数据源
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
//        指定目的地
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
        // 读数据
        int ch;
        while ((ch = in.read()) != -1) {
            out.write(ch);
        }
        in.close();
        out.close();
    }

    //  采用基本流，一次多个字节的赋值方式
    private static void methods02(String src, String dest) throws IOException {
//        指定数据源
        FileInputStream in02 = new FileInputStream(src);
//        指定目的地
        FileOutputStream out02 = new FileOutputStream(dest);
//        读数据
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in02.read(buffer)) != -1) {
            out02.write(buffer, 0, len);
        }
        in02.close();
        out02.close();
    }

    //    方式1 采用基本字节流，一次几个字节的复制
    private static void methods01(String src, String dest) throws IOException {
//        指定数据源
        FileInputStream in = new FileInputStream(src);
//        指定目的地
        FileOutputStream out = new FileOutputStream(dest);
//        读数据
        int ch;
        while ((ch = in.read()) != -1) {
            out.write(ch);
        }
        in.close();
        out.close();
    }
}
