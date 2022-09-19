package tcpTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client01 {
    public static void main(String[] args) throws IOException {

        //创建发送端Socket对象
        Socket s = new Socket("192.168.42.233", 10000);
        //获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("我来自于客户端:".getBytes());
        //接受服务器反馈
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("服务器的反馈： " + data);
        //释放资源

        is.close();
        os.close();
        s.close();
    }

}
