import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StrAppend {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
        bw.append("good morning!");
        bw.append("good morning!");
        bw.append("good morning!");
        bw.append("good morning!");
        bw.flush();

        bw.close();

        Thread.sleep(5000);
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("abc.txt", true));
        bw2.write("well done!");
        bw2.flush();
        bw2.close();
    }
}
