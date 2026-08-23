class NumArray {
    int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        int sum = prefix[0];

        
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right] - (left > 0 ? prefix[left - 1] : 0);
       
    }
}