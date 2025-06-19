// Last updated: 19/06/2025, 09:11:45
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
   Arrays.sort(nums);

    List<List<Integer>> output = new ArrayList<>();
   for (int j =0; j<nums.length; j++){
     if (j > 0 && nums[j] == nums[j - 1]) continue;
    int left = j+1;
    int right = nums.length-1;
        while (left < right) {
            if(nums[j]+nums[right]+ nums[left]==0){
                List<Integer> list = Arrays.asList(nums[j],nums[right], nums[left]);
                Collections.sort(list);
                output.add(list);
            }
            if(nums[j]+nums[right]+ nums[left]<0){
                left++;
            }
            else{
                right--;
            }
        }
        
    
    }
    return output.stream()
    .distinct()
    .toList();
    }


}
