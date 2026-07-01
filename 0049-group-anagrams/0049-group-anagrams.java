class Solution {
    public List<List<String>> groupAnagrams(String[] x) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String i : x) {
			char [] y = i.toCharArray();
			Arrays.sort(y);
			String s = new String(y);
			if(map.containsKey(s)) {
				map.get(s).add(i);
			}
			else if(!map.containsKey(s)){
				map.put(s, new ArrayList());
				map.get(s).add(i);
			}
			
		}
        return new ArrayList(map.values());
        
    }
}