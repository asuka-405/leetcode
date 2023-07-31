public class RunningSum {

    // leetcode 1480
    // https://leetcode.com/problems/fibonacci-number/
    public int[] solve(int[] nums) {
        for(int i = 1; i < nums.length; i++)
            nums[i] += nums[i-1];
        return nums;
    }
}
