package tcpTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server06 {
    public static void main(String[] args) throws IOException {
        //创建服务器端Socket对象
        ServerSocket ss = new ServerSocket(10000);
        while (true) {
            //监听客户端连接
            Socket s = ss.accept();

            //为每个客户端开启一个线程
            new Thread(new ServerThread(s)).start();
        }
//        ss.close();
    }
}
