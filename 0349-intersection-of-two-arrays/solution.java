class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // int[] output = new int[nums1.length + nums2.length];
        ArrayList<Integer> output = new ArrayList<>();
        for(int n1:nums1){
            for(int i=0;i<nums2.length;i++){
                if(nums2[i] == n1){
                    if(output.contains(n1)){
                        break;
                    }
                    output.add(n1);
                }
            }
        }   
        return convertToArray(output);
     }
     public int[] convertToArray(ArrayList<Integer> output){
        int[] arr = new int[output.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = output.get(i);
        }
        return arr;
     }
}