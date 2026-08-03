class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int val=0;
        
        while(temp> 0){
            int rem= temp%10;
            val = val*10+rem;
            temp = temp/10;
        }
        
        return val == x;
    }
}