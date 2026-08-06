class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        
        for(int i:nums){
            // int total = 0;
            // while(i > 0){
            //     i = i/10;
            //     total++;
            // }
            // if(total % 2 == 0){
            //     ans++;
            // }

            // Optmization
            int n = (int)(Math.log10(i)) +1;
            if(n % 2 == 0) ans++;
        }

        return ans;
    }
}