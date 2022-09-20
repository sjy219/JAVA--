package tcpTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server05 {
    public static void main(String[] args) throws IOException {
        //创建服务端Socket对象
        ServerSocket ss = new ServerSocket(10000);
        //监听客户端连接
        Socket s = ss.accept();
        //封装文件写入流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10//a2.txt"));
        //封装服务端数据读入流，并将数据写入文件
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line=br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //发送客户端写入完成
        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw2.write("上传文件成功");
        bw2.newLine();
        bw2.flush();
        //释放资源
        bw.close();
        ss.close();
    }
}
