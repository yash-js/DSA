class Solution {
    public int[][] transpose(int[][] matrix) {
        int n= matrix.length; //row size
        int m = matrix[0].length; //col size
        int[][] ans = new int[m][n]; //swap size of row and col

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 ans[j][i] = matrix[i][j]; //swap values of row and cols
            }
        }

        return ans;

    }
}