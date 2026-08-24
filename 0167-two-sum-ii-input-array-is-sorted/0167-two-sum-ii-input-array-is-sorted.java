class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low = 0;
		int high = nums.length-1;
		while(low<=high) {
			int temp = nums[low]+nums[high];
			if(temp == target) {
				return new int [] {low+1,high+1};
				
			}
			else if(temp>target) {
				high--;
			}
			else {
				low++;
			}
        }
        return new int[]{0};
    }
        
        
    
}