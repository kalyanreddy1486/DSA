class Solution {
    public boolean isValid(String s) {
        String x = s;
        if(x.length()==1){
            return false;
        }
		Stack<Character> stack = new Stack<>();
		boolean yes = true;
		for(int i = 0 ; i<x.length(); i++) {
			if(x.charAt(i) == '(' || x.charAt(i) == '{' || x.charAt(i) == '[') {
				stack.push(x.charAt(i));
			}
			else {
				if(stack.isEmpty()) {
					return false;
					
				}
				else {
					char y = stack.pop();
					if(y == '(' && x.charAt(i) != ')') {
					    return false;
						
					}
					if(y == '[' && x.charAt(i) != ']') {
						return false;
						
					}
					if(y == '{' && x.charAt(i) != '}') {
						return false;
						
					}
					
					
				}
			}
			
		}
        return stack.isEmpty();
       
    }
}