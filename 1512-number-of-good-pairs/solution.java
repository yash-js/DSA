class Solution {
    public int numIdenticalPairs(int[] nums) {
  
        int ans = 0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(i!=j && nums[i] == nums[j]){
                    ans++;
                }
            }
        }

        return ans;


    }
}