public class SearchInsertPosition {

    // leetcode 35
    // https://leetcode.com/problems/search-insert-position/

    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = (end+start)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid-1;
            else if(nums[mid] < target)
                start = mid+1;
        }
        return start;
    }

}
