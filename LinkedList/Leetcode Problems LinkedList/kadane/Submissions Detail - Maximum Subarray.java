class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int best=nums[0], max =nums[0];
        for(int i =1; i<n;i++){
            best =Math.max(best+nums[i], nums[i]);
            max = Math.max(max,best);
        }
        return max;
    }
}