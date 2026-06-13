class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int n = nums.length;
       int totalsum=nums[0], bestmax=nums[0], bestmin=nums[0], maxsum=nums[0],minsum=nums[0];
       for(int i=1;i<n;i++){
        totalsum += nums[i];
        bestmax = Math.max(nums[i], bestmax+nums[i]);
        bestmin = Math.min(nums[i], bestmin+nums[i]);
        maxsum = Math.max(maxsum, bestmax);
        minsum = Math.min(minsum, bestmin);
       }
       if(maxsum<0){
        return maxsum;
       }
       return Math.max(maxsum, totalsum - minsum);
    }
}