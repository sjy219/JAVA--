import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileToArrayList {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("day09//src/Ltfp.txt"));
        ArrayList<Students> students = new ArrayList<>();


        String line;

        while ((line = br.readLine()) != null) {
            Students students1 = new Students();
            String[] line2 = line.split(",");

            students1.setId(line2[0]);
            students1.setName(line2[1]);
            students1.setAge(line2[2]);
            students1.setAddress(line2[3]);

            students.add(students1);
        }

        br.close();
        for(Students str1 : students) {
            System.out.println(str1.getId() + "," + str1.getName() + "," + str1.getAge() + "," + str1.getAddress());

        }
    }
}
