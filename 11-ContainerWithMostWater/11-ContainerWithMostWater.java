// Last updated: 19/06/2025, 09:11:48
class Solution {
    public int maxArea(int[] height) {
        int total = 0;
        int left = 0;
        int right = height.length-1;
        while(right-left>0){
            if(Math.min(height[left],height[right])*(right-left)>total){
                total = Math.min(height[left],height[right])*(right-left);
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;}
    }
        return total;
    }
    }
