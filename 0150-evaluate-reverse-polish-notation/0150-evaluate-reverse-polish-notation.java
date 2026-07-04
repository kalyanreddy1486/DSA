class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(int i = 0 ; i<tokens.length ; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/") && !tokens[i].equals("*") ){
                stack.push(tokens[i]);
            }  
            else{
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                if(tokens[i].equals("+")){
                    stack.push(String.valueOf(b+a));
                }
                if(tokens[i].equals("-")){
                    stack.push(String.valueOf(b-a));
                }
                if(tokens[i].equals("/")){
                    stack.push(String.valueOf(b/a));
                }
                if(tokens[i].equals("*")){
                    stack.push(String.valueOf(b*a));
                }

            }
        }
        return Integer.parseInt(stack.pop());
        
    }
}