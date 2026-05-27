class Solution {
    public int minSubArrayLen(int target, int[] nums) {
          int low=0, sum=0;
          int minsize = Integer.MAX_VALUE;
          for(int high=low; high<nums.length; high++){
            sum += nums[high];

            while(sum>= target){
                minsize = Math.min(minsize, high - low + 1);
                sum -= nums[low];
                low++;
            }
          }

        return minsize == Integer.MAX_VALUE? 0: minsize;
    }
}