package tcpTest;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;
    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            //接受数据写入到文件
//            BufferedWriter bw = new BufferedWriter(new FileWriter("day10//a3.txt"));
            //解决名称冲突问题
            int count = 0;
            File file = new File("day10/a" + count + ".txt");
            while (file.exists()) {
                count++;
                file = new File("day10/a" + count + ".txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            String line;
            while ((line=br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //发送反馈到客户端
            BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw2.write("上传文件成功");
            bw2.newLine();
            bw2.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
