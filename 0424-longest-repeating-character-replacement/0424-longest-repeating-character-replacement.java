class Solution {
    public int characterReplacement(String s, int k) {
        int longsub = 0;
        int maxfreq = 0;
        int [] y = new int[26];
        int low = 0;
        for(int i = 0 ; i<s.length() ; i++){
            y[s.charAt(i)-'A']++;
            maxfreq = Math.max(maxfreq,y[s.charAt(i)-'A']);
            while(((i-low+1)-maxfreq) > k){
                y[s.charAt(low)-'A']--;
                low++;
            }
            longsub = Math.max(longsub,i-low+1);
        }
        return longsub;
    }
}