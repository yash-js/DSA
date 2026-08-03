class Solution {
    public boolean checkIfPangram(String sentence) {
       if(sentence.length() < 26) return false;

        boolean[] freq = new boolean[26];

        for(int i=0; i<sentence.length();i++){
            freq[sentence.charAt(i) - 'a'] = true;
        }

        for(boolean present:freq){
            if(!present) return false;
        }

        return true;

    }
}