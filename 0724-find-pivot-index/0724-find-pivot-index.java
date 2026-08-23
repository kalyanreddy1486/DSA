class Solution {
    public int pivotIndex(int[] nums) {
		int total = 0;
		for(int i = 0 ; i<nums.length ; i++) {
			total += nums[i];
			
		}
		int rightsum = 0;
		for(int i = 0 ; i<nums.length ; i++) {
			
			int same = total-(rightsum+nums[i]);
			if(rightsum == same) {
				return i;
			}
			rightsum += nums[i];
        }
        return -1;
        
    }
}