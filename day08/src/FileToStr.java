import java.io.*;
import java.util.ArrayList;

public class FileToStr {

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new FileReader("Sen.txt"));
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("Sen2.txt"));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("Sen3.txt"));
        ArrayList<String> st1 = new ArrayList<>();
        String sb1 = "";

        String line;
        int i = 0;
        while ((line = br.readLine()) != null) {

//            System.out.println("line: " + line.substring(20));
//            Thread.sleep(70000);

            if (i > 1083) {

                bw2.write(line.substring(19));
                bw2.newLine();
            } else {

                bw1.write(line.substring(19));
                bw1.newLine();
            }
            st1.add(line);
            i++;
        }
        br.close();

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
        bw2.close();
        bw1.close();


    }
}
