class Solution {
    public int findDuplicate(int[] nums) {
        // int [] x = new int[1000001];
        // for(int i = 0 ; i< nums.length ; i++){
        //     x[nums[i]]++;

            

        // }
        // for(int i = 1 ;i<x.length ; i++){
        //     if(x[i]>1){
        //         return i;
        //     }
        // }
        // return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(map.get(nums[i])>1){
                return nums[i];
            }
        }
        return 0;

        
    }
}