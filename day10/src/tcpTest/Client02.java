package tcpTest;

import java.io.*;
import java.net.Socket;

public class Client02 {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.42.233", 10000);
        
        //封装键盘录入，录入并发送数据
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        //封装输出流对象
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

        //释放发送完毕信号
        s.shutdownOutput();
        //读取服务器端的反馈
        BufferedReader brs = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line2;
        line2 = brs.readLine();
        System.out.println("我是来自于服务器端的反馈：" + line2);
        //释放资源
        br.close();
        s.close();
    }
}
