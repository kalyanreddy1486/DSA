class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int [] s1count = new int[26];
        int [] windowcount = new int[26];
        for(int i =0 ; i<s1.length() ; i++){
            s1count[s1.charAt(i)-'a']++;
            windowcount[s2.charAt(i)-'a']++;

        }
        if(matches(s1count,windowcount)){
            return true;
        }
        for(int i = s1.length() ; i<s2.length() ; i++){
            windowcount[s2.charAt(i)-'a']++;
            windowcount[s2.charAt(i-s1.length())-'a']--;
            if(matches(s1count,windowcount)){
                return true;
            }
        }
        return false;
        
    }
    public boolean matches(int [] a, int [] b){
        for(int i = 0 ; i<a.length ; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}