package tcpTest;

import java.io.*;
import java.net.Socket;

public class Client04 {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.42.233", 10000);
        //封装buffer读取文件内容
        BufferedReader br = new BufferedReader(new FileReader("day10//src//tcpTest//Client01.java"));
        //封装客户端网络写入流，发送数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放数据
        br.close();
        s.close();
    }
}
