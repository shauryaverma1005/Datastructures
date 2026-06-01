class Solution {
    public int minSubArrayLen(int target, int[] nums) {
          int left = 0;
          int n = nums.length;
          int windowSum=0;
          int min= Integer.MAX_VALUE;
          for(int right=0; right<=n-1;right++){
            windowSum += nums[right];
            while(windowSum>=target){
                    min = Math.min(min, right-left+1);
                    windowSum -= nums[left];
                    left++;
                }       
            }
            
      
            
       
          if(min == Integer.MAX_VALUE){
            return 0;
          }
          return min;
    }
}