package iop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GameTime2 {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        FileReader fileReader = new FileReader("day12//game.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String sb = bufferedReader.readLine();

        hashMap.put("hello", "world");

        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, String> mp : entrySet) {
            System.out.println(mp);
        }

        String[] sp = sb.split("=");
        int count = Integer.parseInt(sp[1]);
        bufferedReader.close();
        if (count == 3) {
            System.out.println("Bye-Bye");
        } else {
            GamePlay.game();
            count++;
            sp[1] = String.valueOf(count);
            StringBuilder sbs = new StringBuilder();
            sbs.append(sp[0]).append("=").append(sp[1]);
            BufferedWriter bw = new BufferedWriter(new FileWriter("day12//game.txt"));
            bw.write(sbs.toString());
            bw.flush();
            bw.close();
        }


    }
}
