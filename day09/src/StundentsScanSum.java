import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StundentsScanSum {
    public static void main(String[] args) throws Exception {
        ArrayList<String> str1 = new ArrayList<>();
        BufferedWriter bw = new BufferedWriter(new FileWriter("day09//src//points.txt"));
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("请输入要录入学生的个数： ");
        int sc1 = Integer.parseInt(scanner.next());
        int i = 1;
        while (i <= sc1) {
            StringBuffer sb = new StringBuffer();
            System.out.println("请输入第" + i + "个学生的姓名：");
            String name = scanner.next();
            System.out.println("请输入第" + i + "个学生的语文成绩：");
            int chinese = Integer.parseInt(scanner.next());
            System.out.println("请输入第" + i + "个学生的数学成绩：");
            int maths = Integer.parseInt(scanner.next());
            System.out.println("请输入第" + i + "个学生的英语成绩：");
            int englis = Integer.parseInt(scanner.next());

            i++;
        }

        bw.close();
    }
}
