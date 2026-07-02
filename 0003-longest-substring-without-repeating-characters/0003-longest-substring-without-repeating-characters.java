class Solution {
    public int lengthOfLongestSubstring(String s) {
        String x = s;
		int count = 0;
		int low = 0;
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0 ; i<x.length() ; i++) {
			char y = x.charAt(i);
			if(map.containsKey(y)) {
				while(map.containsKey(y)) {
					map.remove(x.charAt(low));
					low++;
					
				}
				map.put(y, 1);
				
				
			}
			else {
				map.put(y, map.getOrDefault(y,0)+1);
			}
			count = Math.max(count, i-low+1);
		}
        return count;
    }
}