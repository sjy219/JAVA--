package tcpTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server03 {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象
        ServerSocket ss = new ServerSocket(10000);
        //监听客户端
        Socket s = ss.accept();
        //封装输入流，读取输入流数据，并写入文本文件
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10//a1.txt"));
        String line;
        while ((line=br.readLine()) != null) {
            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        s.close();
        ss.close();
    }
}
