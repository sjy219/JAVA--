package tcpTest;

import java.io.*;
import java.net.Socket;

public class Client03 {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象
        Socket s = new Socket("192.168.42.233", 10000);
        //封装键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //创建客户端输出流，并发送数据，发送886结束发送
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        br.close();
        s.close();
    }
}
