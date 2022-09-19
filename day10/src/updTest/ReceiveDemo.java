package updTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接受端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(10000);
        while (true) {
            //创建一个数据包，用于接受数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            //调用DatagramSocket对象的方法接受数据
            ds.receive(dp);
            //解析数据包，并把数据写在控制台上
            System.out.println("来自客户端的数据：" + new String(dp.getData(),0,dp.getLength()));
        }
        //关闭接受端
//        ds.close();
    }
}
