package iop;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * BufferedOutPutStream(OutPutStream out)
 * BufferedInputSteam(InputStream in)
 *
 * */

public class BufferIO {
    public static void main(String[] args) throws Exception {
        //字节缓冲输出流BufferedOutPutStream(OutPutStream out)
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("day12//f0.txt"));
        bo.write("helloworld\r\n".getBytes());

        //释放资源
        bo.close();

        //字节缓冲输入流BufferedInputStream(InputStream in)
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("day12//f0.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bi.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        bi.close();
    }
}
