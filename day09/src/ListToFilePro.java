import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class ListToFilePro {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("day09//src//Ltfp.txt"));
        ArrayList<Students> students = new ArrayList<>();
        Students st1 = new Students("1", "张三", "20", "Bolen Street NO.20");
        Students st2 = new Students("2", "张四", "20", "Bolen Street NO.20");
        Students st3 = new Students("3", "张五", "20", "Bolen Street NO.20");
        Students st4 = new Students("4", "张六", "20", "Bolen Street NO.20");

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);



        for(Students str1 : students) {
            StringBuilder sb = new StringBuilder();
            sb.append(str1.getId()).append(",")
                            .append(str1.getName())
                            .append(",").append(str1.getAge())
                            .append(",").append(str1.getAddress());
            String s = sb.toString();
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
