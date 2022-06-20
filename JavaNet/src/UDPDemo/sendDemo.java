package UDPDemo;
//DatagramSocket
//此类表示用于发送和接收数据报包的套接字。
//        数据报套接字是分组传送服务的发送或接收点。 在数据报套接字上发送或接收的每个数据包都是单独寻址和路由的。 从一台机器发送到另一台机器的多个分组可以被不同地路由，并且可以以任何顺序到达。
//
//        在可能的情况下，新构建的DatagramSocket启用了SO_BROADCAST套接字选项，以允许传输广播数据报。 为了接收广播数据包，应将DatagramSocket绑定到通配符地址。 在一些实现中，当DatagramSocket绑定到更具体的地址时，也可以接收广播分组。
//

//DatagramPacket

//该类表示数据报包。
//        数据报分组用于实现无连接分组传递服务。 每个消息仅根据该数据包中包含的信息从一台机器路由到另一台机器。 从一台机器发送到另一台机器的多个数据包可能会以不同方式路由，并且可能以任何顺序到达。 无法保证数据包传输。
//
//        从以下版本开始：


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class sendDemo {
    public static void main(String[] args) throws IOException {
        //1,创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();
        //2，创建DatagramPacket对象，并封装数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }

            byte[] bys = line.getBytes();
            //构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.0.105"), Integer.parseInt("12345"));

            ds.send(dp);
        }

        ds.close();
    }
}
