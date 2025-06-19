// Last updated: 19/06/2025, 09:11:53
class Solution {
    public String longestPalindrome(String s) {
    
        String word = "";
        for(int i =0;i<s.length();i++){
            for(int j=s.length()-1;j>=i;j--){
                String temp = s.substring(i,j+1);
                if(isPalindrome(temp, 0, temp.length()-1)&&temp.length()>word.length()){
                    word=temp;
                }
            }
        }
        return word;
    }

   public boolean isPalindrome(String s, int left, int right) {
    while (left < right) {
        if (s.charAt(left++) != s.charAt(right--)) return false;
    }
    return true;
}

}