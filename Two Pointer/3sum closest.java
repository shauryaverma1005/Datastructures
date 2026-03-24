import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int result = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i=0; i< nums.length-2; i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum = nums[i] +  nums[left] + nums[right];
                
                if(Math.abs(target-sum) < Math.abs(target-result)){
                    result = sum;
                }
                if(sum == target){
                    return sum;
                } else if(sum >target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}