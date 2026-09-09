class Solution {
    public int check(int mid , int [] nums){
        int total = 0;
        for(int i : nums){
            total += Math.ceil((double)i/mid);

        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i  : piles){
            max = Math.max(max,i);
        }
        int low = 1;
        int high = max;
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(check(mid,piles) <=h){
                ans = mid;
                high = mid-1;
                
            }
            else {
                low = mid+1;
            }
        }
        
        return ans;
    }
}