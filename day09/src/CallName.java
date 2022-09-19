import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class CallName {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("day09//src//students.txt"));
        ArrayList<String> str1 = new ArrayList<>();
        String line;
        while ((line=br.readLine()) != null) {
            str1.add(line);
        }
        br.close();

        Random random = new Random();
        int rs = random.nextInt(str1.size());
        String s = str1.get(rs);
        System.out.println("s: " + s);



    }
}
