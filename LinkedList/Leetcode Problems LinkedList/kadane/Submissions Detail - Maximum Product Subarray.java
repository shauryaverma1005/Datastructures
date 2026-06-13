class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n==1){return nums[0];}
        int minbest=nums[0], maxbest=nums[0], max=nums[0];
        for(int i=1;i<n;i++){
            int v2=minbest * nums[i];
            int v3 = maxbest*nums[i];
            maxbest = Math.max(nums[i], Math.max(v2,v3));
            minbest = Math.min(nums[i], Math.min(v2,v3));
            max = Math.max(max,maxbest);
        }
        return max;
    }
}