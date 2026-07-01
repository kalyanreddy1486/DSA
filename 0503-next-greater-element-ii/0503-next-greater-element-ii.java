class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int n = nums.length;
        int [] res = new int[n];
        for(int i = n-1 ; i>=0; i--){
            while(!stack1.isEmpty() && stack1.peek()<=nums[i]){
                stack1.pop();
            }
            if(stack1.isEmpty()){
                res[i] = Integer.MIN_VALUE;

            }
            else{
                res[i] = stack1.peek();
            }
            stack1.push(nums[i]);
            stack2.push(nums[i]);
        }
        for(int i = n-1 ; i>=0 ; i--){
            if(res[i] ==  Integer.MIN_VALUE){
                while(!stack2.isEmpty() && stack2.peek() <= nums[i]){
                    stack2.pop();
                }
                if(stack2.isEmpty()){
                    res[i] = -1;
                }
                else{
                    res[i] = stack2.peek();
                }
                stack2.push(nums[i]);
                
            }
        }
        return res;
        
    }
}