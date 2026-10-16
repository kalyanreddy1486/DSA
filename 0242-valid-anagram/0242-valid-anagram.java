class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int [] x = new int[26];
        int [] y = new int[26];
        for(int i = 0 ; i<s.length() ; i++){
            x[s.charAt(i)-'a']++;
        }
        for(int i = 0 ; i<t.length() ; i++){
            y[t.charAt(i)-'a']++;

        }
        for(int i = 0 ; i<x.length ; i++){
            if(x[i]!=y[i]){
                return false;
            }
        }
        return true;
        
    }
}