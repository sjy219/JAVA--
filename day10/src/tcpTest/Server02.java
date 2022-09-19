package tcpTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
    public static void main(String[] args) throws IOException {
        //创建服务端Socket对象
        ServerSocket ss = new ServerSocket(10000);
        //监听客户端
        Socket s = ss.accept();
        //封装读出流，读出数据，并显示在控制台
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line;
        while ((line=br.readLine()) != null) {
            System.out.println("来自客户端的数据： " + line);
        }
        //发送反馈到客户端
        BufferedWriter os = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        os.write("我是来自于服务器端的反馈");
        //释放资源
        os.close();
        s.close();
        ss.close();

    }
}
