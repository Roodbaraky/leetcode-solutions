// Last updated: 19/06/2025, 09:11:56
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i=0;i<nums.length;i++){
           if(seen.containsKey(nums[i])){
            return new int[]{i, seen.get(nums[i])};
           }
           int match = target-nums[i];
           seen.put(match, i);

        }
    return new int[]{0,0};}
}