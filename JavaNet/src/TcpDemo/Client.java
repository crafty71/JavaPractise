package TcpDemo;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建Socket对象
        Socket s = new Socket("192.168.0.105", 20000);

        //封装文本文件
        BufferedReader br = new BufferedReader(new FileReader("JavaNet\\UDPDemo\\sendDemo.java"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.shutdownOutput();

        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String data = brClient.readLine();

        System.out.println("服务器的反馈：" + data);

        br.close();
        s.close();
    }
}
