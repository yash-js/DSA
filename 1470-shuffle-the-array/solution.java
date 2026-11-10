class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = Arrays.copyOf(nums, n*2);
        for(int i=0; i<n;i++){
            res[i*2] = nums[i];
            res[2*i+1] = nums[i+n];
        }
        return res;
    }
}