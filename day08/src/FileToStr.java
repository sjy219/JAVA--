import java.io.*;
import java.util.ArrayList;

public class FileToStr {

    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        * 从一个文件向另外2个文件写东西，直接使用Buffered就可以了，中间可以不用经过集合的处理
        * readline()从一个文件读出来的字符串经过处理，然后以String的形式写入到另外一个文件中
        *
        * */
//        BufferedReader br = new BufferedReader(new FileReader("Sen.txt"));
//        BufferedWriter bw1 = new BufferedWriter(new FileWriter("Sen2.txt"));
//        BufferedWriter bw2 = new BufferedWriter(new FileWriter("Sen3.txt"));
//        ArrayList<String> st1 = new ArrayList<>();
//        String sb1 = "";
//
//        String line;
//        int i = 0;
//        while ((line = br.readLine()) != null) {
//
//            if (i > 1083) {
//
//                bw2.write(line.substring(19));
//                bw2.newLine();
//            } else {
//
//                bw1.write(line.substring(19));
//                bw1.newLine();
//            }
//            st1.add(line);
//            i++;
//        }
//        br.close();
//        bw2.close();
//        bw1.close();

//        System.out.println(st1.size());
//        Thread.sleep(70000);

//        for (int i = 0; i < st1.size(); i++) {
//            if (i > 1083) {
//                sb1 = st1.get(i).substring(19);
//                bw2.write(sb1);
//                bw2.newLine();
//            } else {
//                sb1 = st1.get(i).substring(19);
//                bw1.write(sb1);
//                bw1.newLine();
//            }
//
//        }


        /*
        * 应该可以使用多线程进行改进
        * 从文件尾写入文件new FileWriter(filePath, true),第二个参数设置为true
        * */
        BufferedReader br4 = new BufferedReader(new FileReader("Sen2.txt"));
        BufferedReader br5 = new BufferedReader(new FileReader("Sen3.txt"));
        BufferedWriter bw4 = new BufferedWriter(new FileWriter("Sen4.txt"));

        int i2 = 2;
        String line2 = new String();
        while ((line2 = br5.readLine()) != null  && i2 > 1) {
            if (i2 < 1086) {
                bw4.write(br4.readLine());
                bw4.newLine();
                bw4.write(line2);
                bw4.newLine();

            } else {
                bw4.write(br5.readLine());
                bw4.newLine();
            }
            i2++;
        }
        bw4.flush();
        br4.close();
        br5.close();
        bw4.close();

        //Thread.sleep(5000);
//        BufferedWriter bw5 = new BufferedWriter(new FileWriter("Sen4.txt", true));
//        bw5.append("Hellsdfsdfsdo");
//        bw5.flush();
//        br5.close();

    }
}
