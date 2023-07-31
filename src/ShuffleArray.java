public class ShuffleArray {

    // leetcode 1470
    // https://leetcode.com/problems/shuffle-the-array/

    public int[] shuffle(int[] nums, int n) {
        // int[] copy = new int[n*2];
        // int j = 0;
        // for(int i = 0; i < n; i++){
        //     copy[j++] = nums[i];
        //     copy[j++] = nums[n+i];
        // }
        // return copy;

        for(int i = 0; i < n; i++){
            nums[i] = nums[i] << 10;
            nums[i] = nums[i] | nums[n+i];
        }
        int j = 2*n-1;

        for(int i = n-1; i >= 0; i--){
            nums[j--] = nums[i] & 0b1111111111;
            nums[j--] = nums[i] >> 10;
        }

        return nums;
    }
}
