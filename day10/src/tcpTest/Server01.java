package tcpTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        ServerSocket ss = new ServerSocket(10000);
        //监听客户端
        Socket s = ss.accept();
        //获取输入流,读数据，并把数据显示在控制台上
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("来自于客户端的数据: " + data);
        //发出反馈到客户端
        OutputStream os = s.getOutputStream();
        os.write("我是服务器端的反馈： ".getBytes());
        //释放资源
        os.close();
        is.close();
        ss.close();
    }
}
