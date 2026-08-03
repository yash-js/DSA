class Solution {
    public int largestAltitude(int[] gain) {
        // int max = 0;
        // int current = 0; 

        // for(int i=0;i<gain.length;i++){
        //     current = current + gain[i];
        //     if(current > max){
        //      max = current;   
        //     }
        // }
        // return max;

        int current = 0;
        int highest = current;

        for(int altitude:gain){
            current += altitude;
            highest =  Math.max(highest,current);
        }

        return highest;

    }
}