import java.util.Arrays;
public class Solution2 {

    public Solution2()  {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Solution2 mySo = new Solution2();
        int[] num1 = {3, 5};
        System.out.println(mySo.specialArray(num1));
    }

    public int specialArray(int[] nums) {
        boolean fal = false;
        int results = 0;
        int j = 1;
        while (j <= nums.length) {
            int scores = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= j) {
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
            //System.out.println("No 'X' find!!" + "-1");
            return -1;
        } else {
            return results;
            //System.out.println("Find 'X': " + results);
        }

    }
}
