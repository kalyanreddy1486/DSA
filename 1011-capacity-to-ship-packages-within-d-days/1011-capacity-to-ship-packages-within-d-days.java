class Solution {
    public int shipWithinDays(int[] y, int days) {
        int low = 0;
		int high = 0;
		for(int i : y) {
			low  =  Math.max(i, low);
			high += i;
		}
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(check(y,days,mid)) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
        return low;
    }
    public  boolean check(int [] y , int days , int mid) {
		int reqdays = 1;
		int currload = 0;
		for(int i : y) {
			if(currload+i>mid) {
				reqdays++;
				currload = i;
			}
			else {
				currload += i;
			}
		}
		return reqdays<=days;
	}

}