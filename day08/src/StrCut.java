import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StrCut {


    public static void main(String[] args) throws IOException {
        List<String> str1 = new ArrayList<String>();
        str1.add("hello world this is!");
        str1.add("the work is ready so you can do it now!!");
        str1.add("now let's dance ok?");
        System.out.println(str1);

        String wp = new String("wallpaper");

        System.out.println("wp: " + wp.substring(2));

        BufferedWriter brw = new BufferedWriter(new FileWriter("abc.txt"));
        for (String str3 : str1) {
            brw.write(str3);
            brw.newLine();
            brw.flush();
        }
        brw.write("good");
        brw.close();
    }
}
