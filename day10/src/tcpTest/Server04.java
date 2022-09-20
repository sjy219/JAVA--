package tcpTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server04 {
    public static void main(String[] args) throws IOException {
        //创建服务端SOcket对象
        ServerSocket ss = new ServerSocket(10000);
        //监听客户端连接
        Socket s = ss.accept();
        //封装文件写入流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10//a2.java"));
        //封装服务端网络读入流，把数据写入到文件
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line=br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        ss.close();
    }
}
