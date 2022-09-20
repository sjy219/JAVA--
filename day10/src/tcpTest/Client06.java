package tcpTest;

import java.io.*;
import java.net.Socket;

public class Client06 {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.42.233", 10000);
        //封装文件读出流
        BufferedReader br = new BufferedReader(new FileReader("day10//src//tcpTest//Client01.java"));
        //封装客户端网络写入流，并将文件内容写入写入流中
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放文件传输完成信号
        s.shutdownOutput();

        //接收服务器的反馈，并打印到控制台中
        BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = br2.readLine();
        System.out.println(data);
        //释放资源
        br.close();
        s.close();
    }
}
