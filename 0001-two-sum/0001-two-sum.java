class Solution {
    public int[] twoSum(int[] nums, int target) {
   
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i<nums.length ; i++){
            int p = nums[i];
            int t = target-p;
            if(map.containsKey(t)){
                return new int[]{map.get(t),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};

        
    }
}