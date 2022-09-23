package iop;

import java.io.FileOutputStream;

/*
 *FileOutPutSteam写数据的三种方式:
 *  void write(int b)       将指定的字节写入文件输出流，一次写一个字节数据
 *  void write(byte[] b)    将b.length的字节从字节数组中写入此文件输出流，一次写一个字节数组的数据
 *  void write(byte[], int off, int len)
 *      将len字节从指定的字节数组开始，从偏移量off处开始写入此文件输出流，一次写一个字节数组的部分数据
 *
 * */
public class FileOutPutStream02 {
    public static void main(String[] args) throws Exception{
        //创建一个文件的字节输出流对象
        //以追加的方式进行写入
        FileOutputStream fo = new FileOutputStream("day12//f0.txt", true);

        //一次写一个字节
//        fo.write(99);

        //一次写一个字节数组（1）
//        byte[] bytes = {97, 98, 99};
//        fo.write(bytes);

        ////一次写一个字节数组（2）
//        fo.write("helloworld".getBytes());

        //一次写一个字节数组的一部分
//        byte[] bytes = "helloworld".getBytes();
//        fo.write(bytes, 0, bytes.length);

        //追加+换行符
        byte[] bytes = "helloworld".getBytes();
        byte[] bytes1 = "\r\n".getBytes();
        fo.write(bytes1);
        fo.write(bytes, 0, bytes.length);

        fo.close();

    }
}
