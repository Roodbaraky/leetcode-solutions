// Last updated: 19/06/2025, 09:11:49
class Solution {
    private int shift(int x, int y){
        return (y*10) + (x%10);
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original = x;
        int y = 0;
        while (x>0){
            y=shift(x,y);
            x=Math.floorDiv(x,10);
        }
        return y==original;

    }
    
}