class Solution {
    public int splitArray(int[] nums, int k) {

        int low = -1;
        int high = 0;

        for (int i = 0; i < nums.length; i++) {
            low = Math.max(nums[i], low);
            high += nums[i];
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (find(nums, k, mid) <= k) {
                high = mid;
            } 
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    public int find(int[] nums, int k, int mid) {

        int curar = 1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (sum + nums[i] > mid) {
                curar++;
                sum = nums[i];
            } 
            else {
                sum += nums[i];
            }
        }

        return curar;
    }
}