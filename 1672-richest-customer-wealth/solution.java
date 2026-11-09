class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for(int row = 0; row < accounts.length ; row++){
            int sum = 0;
            for(int col=0;col < accounts[row].length;col++){
                sum += accounts[row][col];
            }
             wealth = Math.max(wealth,sum); 
        }
        return wealth;
    }
}