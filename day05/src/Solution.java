import java.util.Random;
import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
//        int[] num1 = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < num1.length; i++) {
//            num1[i] = random.nextInt(101);
//        }
//        System.out.println(Arrays.toString(num1));
        int[] num1 = {3};

        //int leng = num1.length;
        boolean fal = false;
        int results = 0;
        int j = 1;
        while (j <= num1.length) {
            int scores = 0;
            for (int i = 0; i < num1.length; i++) {
                if (num1[i] >= j) {
                    scores++;
                }
            }
            if (scores == j ) {
                results = scores;
                fal = true;
                break;
            } else {
                fal = false;
            }

            j++;
        }
        if (!fal) {
            System.out.println("No 'X' find!!" + "-1");
        } else {
            System.out.println("Find 'X': " + results);
        }


    }
}
