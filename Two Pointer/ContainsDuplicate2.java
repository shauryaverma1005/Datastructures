class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0;
        int j=i+1;
        int dist = Integer.MAX_VALUE;
        int n = nums.length;
        while(j<n){
            while(j<n && Math.abs(i-j) <= k){
                if(nums[i]==nums[j]){
                    return true;
                }
                j++;
            }
            i++;
            j=i+1;
        }
        return false;
    }
}