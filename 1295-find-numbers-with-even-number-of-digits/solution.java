class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        
        for(int i:nums){
            int total = 0;
            while(i > 0){
                i = i/10;
                total++;
            }
            if(total % 2 == 0){
                ans++;
            }
        }

        return ans;
    }
}