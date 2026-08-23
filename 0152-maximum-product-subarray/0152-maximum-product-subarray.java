class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for(int i = 1 ; i<nums.length ; i++){
            int a = nums[i]*max;
            int b = nums[i]*min;
            max = Math.max(nums[i],Math.max(a,b));
            min = Math.min(nums[i],Math.min(a,b));
            result = Math.max(max,result);
        }
        return result;
        
    }
}