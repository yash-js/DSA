class Solution {
    public int removeDuplicates(int[] nums) {
        int sum = 1;
        int start = 0;
        int next = 1;
        while(next < nums.length){
            if(nums[next] != nums[start]){
                sum++;
                start++;
                nums[start] = nums[next]; 
            }
            next++;
        }
        return sum;
    }
}