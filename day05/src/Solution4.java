public class Solution4 {

    public static void main(String[] args) {

    }

    public int specialArray(int[] nums) {
        int results = 0;
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i) {
                    results++;
                }
            }
            if (results == i) {

            }
        }
        return 0;
    }
}
