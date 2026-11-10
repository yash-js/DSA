class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for(int[] account: accounts){
            int sum = 0;
            for(int n: account){
                sum += n;
            }
            if(sum> max){
                max = sum;
            }
        }

        return max;

    }
}