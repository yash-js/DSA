class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = Arrays.copyOf(nums, n*2);
        
        for(int i=0; i<n;i++){
            res[i+n] = nums[i];
        }

        return res;

    }
}