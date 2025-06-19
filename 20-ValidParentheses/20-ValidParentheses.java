// Last updated: 19/06/2025, 09:11:47
class Solution {
    public boolean isValid(String s) {
        if (s.length()%2!=0||s.length()==0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] myArray = s.toCharArray();
        for(int i=0;i<s.length();i++){
            char ct =  myArray[i];
            if(
                ct == '[' ||
                ct =='{' ||
                ct == '('
                ){
                    stack.push(ct);
                }
                else{

                
           if ((ct == ']'&&!stack.isEmpty() && stack.peek() == '[') ||
                    (ct == '}'&&!stack.isEmpty() && stack.peek() == '{') ||
                    (ct == ')'&&!stack.isEmpty() && stack.peek() == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
}}
             
       
    
     return stack.isEmpty();
}
}