class Solution {
    public int maxArea(int[] heights) {
        int [] x = heights;
        int left = 0;
		int right =  x.length-1;
		int maxarea = 0;
		while(left<right) {
			int width = right-left;
			int height = Math.min(x[left],x[right]);
			maxarea = Math.max(maxarea, height*width);
			
			if(x[left]<x[right]) {
				left++;
				
			}
			else {
				right--;
			}
		}
        return maxarea;
        
    }
}