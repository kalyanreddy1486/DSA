class Solution {
    public boolean isAnagram(String s, String t) {
        // char s1 [] = s.toCharArray();
        // char t1 [] = t.toCharArray();
        // Arrays.sort(s1);
        // Arrays.sort(t1);
        // if(s.length() != t.length()){
        //     return false;
        // }
        // else{
        //     for(int i = 0 ; i<s.length() ; i++){
        //         if(s1[i] != t1[i]){
        //             return false;
                   
        //         }
        //     }
        //     return true;
        // }
        if(s.length() != t.length()){
            return false;
        }

        int [] arr = new int[26];
        for(int i = 0 ; i<s.length() ; i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i = 0 ; i<t.length() ; i++){
            arr[t.charAt(i)-'a']--;
        }
        for(int i= 0 ; i<arr.length ; i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;

        
    }
}