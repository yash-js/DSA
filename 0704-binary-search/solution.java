class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        // Write your loop here
            while(high > low){
            if(nums[low] == target){
                return low;
            } else if(nums[high] == target){
                return high;
            }
                low++;
                high--;
            }
        return -1;
    }
}