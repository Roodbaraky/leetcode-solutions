// Last updated: 19/06/2025, 09:11:43
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return binSearch(nums, target);
        
    }

    public int[] binSearch(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int first =binSearchLeft(nums,target, left,right);
        int last =binSearchRight(nums, target, left, right);
        return new int[]{first,last};
    }

    public int binSearchLeft(int[] nums, int target, int left, int right){
        if (left > right) return -1;
        int middle = (left+right)/2;
        if(target>nums[middle]){
            return binSearchLeft(nums, target, middle+1,right);
        }
        else {
            if ((middle == 0 || nums[middle - 1] < target)&&nums[middle]==target) {
                return middle;
            } else {
                return binSearchLeft(nums, target, left, middle - 1);
         }
}
    }

    public int binSearchRight(int[] nums, int target, int left, int right){
        if (right<left)return-1;
        int middle = (left+right)/2;
        if (target<nums[middle]){
            return binSearchRight(nums, target, left,middle-1);
        }
        else{
            if((middle==nums.length-1||nums[middle+1]>target)&&nums[middle]==target){
                return middle;
            }
            else{
                return binSearchRight(nums, target, middle+1, right);
            }
        }
    }
}