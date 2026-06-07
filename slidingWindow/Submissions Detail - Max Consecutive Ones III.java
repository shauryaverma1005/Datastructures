class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left =0;
        int maxLen = 0;
        int freq[] = new int[2];
        for(int right =0; right<n ; right++){
            freq[nums[right]]++;
            while((right-left + 1) - freq[1] > k){
                freq[nums[left]]--;
                left++;
            }
            maxLen = Math.max(maxLen, (right-left)+1);
        }
        return maxLen;    
    }
}