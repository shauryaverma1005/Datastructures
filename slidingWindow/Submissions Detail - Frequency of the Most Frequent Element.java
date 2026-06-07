class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        
        int left =0;
        int maxFreq =0;
        long windowSum=0;
        
        for(int right=0; right<nums.length; right++){
            windowSum += nums[right];
            while(((long)(right - left + 1) * nums[right]) - windowSum > k){
                windowSum -= nums[left];
                left++;
            }
            maxFreq = Math.max(maxFreq, right-left+1);
        }
        
        return maxFreq;
    }
}