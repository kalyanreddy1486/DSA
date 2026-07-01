class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = temp.length;
        int [] res = new int[n];
        for(int i = n-1 ; i>=0 ; i--){
            while (!stack.isEmpty() && temp[stack.peek()] <= temp[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(i,0);

            }
            else{
                int e = stack.peek()-i;
                map.put(i,e);
                
            }
            stack.push(i);

        }
        for(int i = 0 ; i<n ; i++){
            res[i] = map.get(i);
        }
        return res;
        
    }
}