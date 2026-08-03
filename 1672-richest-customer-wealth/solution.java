class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = Integer.MIN_VALUE;

        for(int[] customer: accounts){
            int sum = 0;
            for(int n: customer){
                sum += n;
            }
            if(sum > richest){
                richest = sum;
            }
        }
        return richest;

    }
}