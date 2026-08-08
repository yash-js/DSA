class Solution {
    public int countNegatives(int[][] grid) {
        int c =  0;

        for(int[] i:grid){
            for(int n:i){
                if(n < 0){
                    c++;
                }
            }
        }

        return c;
    }
}