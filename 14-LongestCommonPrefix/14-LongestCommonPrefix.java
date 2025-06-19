// Last updated: 19/06/2025, 09:11:46
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder common = new StringBuilder();
    
        String first = strs[0];
      
        for(int i=0; i<first.length();i++){
            char temp = first.charAt(i);
            for(String str:strs){
                if(i>str.length()-1||str.charAt(i)!=temp){
                    return common.toString();
                   
                }
            }
             common.append(temp);
        }
        return common.toString();
    }
}