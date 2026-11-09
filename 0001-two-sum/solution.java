class Solution {
    public int[] twoSum(int[] nums, int target) {
              ArrayList<Integer> list = new ArrayList<>();
        
     for (int i = 0; i < nums.length; i++) {
            // For each number, check against all subsequent numbers
            for (int j = i + 1; j < nums.length; j++) {
                // If the sum of the two numbers equals the target
                if (nums[i] + nums[j] == target) {
                    // Add the indices to the ArrayList
                    list.add(i);
                    list.add(j);
                    
                    // Convert ArrayList to int[] manually
                    int[] result = new int[list.size()];
                    for (int k = 0; k < list.size(); k++) {
                        result[k] = list.get(k);
                    }
                    return result; // Return the result
                }
            }
        }
        
        // Return an empty array if no solution is found
        return new int[0];
        
       
    }
}