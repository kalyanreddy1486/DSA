class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
		int high = s.length()-1;
		boolean j = true;
		while(low<high) {
			while(low<high && !Character.isLetterOrDigit(s.charAt(low))) {
				low++;
			}
			while(high>low && !Character.isLetterOrDigit(s.charAt(high))) {
				high--;
			}
			if(Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
				j = false;
			}
			low++;
			high--;
			
		}
        return j;
        
    }
}