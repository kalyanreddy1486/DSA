class Solution {
    public String longestPalindrome(String s) {
        int start = 0 ;
        int end = 0;
        int max = 0;
        for(int i = 0 ; i<s.length() ; i++){
            int len1 = matches(s,i,i);
            int len2 = matches(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len>max){
                max = len;
                start = i-((len-1)/2);
                end = i+(len/2);
            }
        }
        return s.substring(start,end+1);
    }
    public int matches(String s, int low,int high){
        while(low>=0 && high<s.length() && s.charAt(low) == s.charAt(high)){
            low--;
            high++;
        }
        return high-low-1;
    }
}