class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int start = 0;
            int end = image[i].length-1;

            while(start <= end){
                int temp =image[i][start] ^ 1;
                image[i][start] = image[i][end] ^ 1;
                image[i][end] = temp;
                
                start++;
                end--;
            }

// Invert without XOR Bitwise Operator
            // for(int j=0;j<image[i].length;j++){
            //     if(image[i][j] == 0){
            //         image[i][j] =1;
            //     } else{
            //         image[i][j] =0;
            //     }
            // }
            

        }
        return image;
    }
}