class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int result  = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tempMax = maxProd;
            int tempMin = minProd;

            maxProd = Math.max(nums[i], Math.max(tempMax * nums[i], tempMin * nums[i]));
            minProd = Math.min(nums[i], Math.min(tempMax * nums[i], tempMin * nums[i]));
            result  = Math.max(result, maxProd);
        }

        return result;
    }
}