package iop;

/*
 * 需求：复制视频，测试每一种读写文件的速度
 *
 * */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyVideo {
    public static void main(String[] args) throws Exception {
        //记录开始时间
        long startTime = System.currentTimeMillis();
        //不使用Buffered，一次读写一个字节
        method1();//耗时91675ms

        //不使用Buffered，一次读写一个字节数组
//        method2();//耗时240

        //使用Buffered,一次读写一个字节
//        method3();//1634

        //使用Buffered一次读写一个字节数组
//        method4();//95

        //记录结束时间，并打印出所耗时间
        long endTime = System.currentTimeMillis();
        System.out.println("耗时： " + (endTime - startTime));
    }

    public static void method4() throws Exception {
        BufferedInputStream br = new BufferedInputStream(new FileInputStream("2.mp4"));
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("day12//2.mp4"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = br.read(bytes)) != -1) {
            bw.write(bytes,0,len);
        }
        bw.close();
        br.close();
    }

    public static void method3() throws Exception {
        BufferedInputStream br = new BufferedInputStream(new FileInputStream("2.mp4"));
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("day12//2.mp4"));
        int by;
        while ((by = br.read()) != -1) {
            bw.write(by);
        }
        bw.close();
        br.close();
    }

    public static void method2() throws Exception {
        FileInputStream fio = new FileInputStream("2.mp4");
        FileOutputStream fos = new FileOutputStream("day12//2.mp4");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fio.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fio.close();
        fos.close();
    }

    public static void method1() throws Exception {
        FileInputStream fio = new FileInputStream("2.mp4");
        FileOutputStream fos = new FileOutputStream("day12//2.mp4");
        int by;
        while ((by = fio.read()) != -1) {
            fos.write(by);
        }
        fio.close();
        fos.close();
    }
}
