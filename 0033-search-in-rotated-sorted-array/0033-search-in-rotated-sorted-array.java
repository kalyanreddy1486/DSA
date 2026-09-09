class Solution {
    public int search(int[] nums, int target) {
        //approch 1
        // int f = -1;
        // for(int i = 0 ; i<nums.length ; i++){
        //     if(nums[i]==target){
        //         f = i;
        //         break;
        //     }
        // }
        // return f;
        int low = 0;
        int high = nums.length-1;
        int f = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                f = mid;
                break;
            }
            else if(nums[low]<= nums[mid]){
                if(nums[low]<=target && target<nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return f;
    }
}