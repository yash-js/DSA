class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        
        for(int i=0; i<n;i++){
            // for(int j=0;j<mat[i].length;j++){
            //     if(i == j || i+j == n-1){
            //         sum += mat[i][j];
            //     }
            // }

            sum += mat[i][i];

            if(i != n-1-i){
                sum += mat[i][n-1-i];
            }
        }

        return sum;
    }
}