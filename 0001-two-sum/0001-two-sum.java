class Solution {
    public int[] twoSum(int[] x, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0 ; i<x.length ; i++) {
			int com = target-x[i];
			if(map.containsKey(com)) {
				return new int [] {map.get(com),i};
				
				
				
				
			}
			map.put(x[i],i);
			
		}
        return new int[]{};
        
    }
}