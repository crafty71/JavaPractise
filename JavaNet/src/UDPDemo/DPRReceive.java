package UDPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DPRReceive {
    public static void main(String[] args) throws IOException {
        //1,创建DatagramSocket对象,并指定端口
        DatagramSocket ds = new DatagramSocket(12345);
//     创建DatagramSocket对象,创建一个空的仓库
        while (true) {
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
//      接收数据存储到DatagramPacket对象中
            ds.receive(dp);
            System.out.println("数据时:" + new String(dp.getData(), 0, dp.getLength()));
        }
    }
}
