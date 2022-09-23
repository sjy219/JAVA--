package iop;

import java.io.FileOutputStream;

/*
* FileOutPutStream 用于将数据写入file
*   FileOutPutStream(String name),创建文件输出流，以指定的名称写入文件
* */
public class FileOutPutStream01 {
    public static void main(String[] args) throws Exception{
        //
        FileOutputStream fo = new FileOutputStream("day12//f0.txt");
        //void write(int b), 将指定的字节写入此文件输出流
        fo.write(97);

        fo.close();
    }
}
