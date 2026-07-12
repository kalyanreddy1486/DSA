class Solution {
    public boolean isPalindrome(int x) {
        int c = x;
        int z = 0;
        while(x>0){
            int u = x%10;
            z = z*10+u;
            x = x/10;


        }
        return z==c;
       
     
    }
}