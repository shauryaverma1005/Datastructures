class Solution {
    public int maximumUniqueSubarray(int[] nums) {
     HashSet<Integer> set = new HashSet<>();
     int n = nums.length;
     int low =0;
     int windowSum =0;
     int score=0;
     int max=0;
     for(int high=0; high<n; high++){
        while(set.contains(nums[high])){
            windowSum -= nums[low];
            set.remove(nums[low]);
            low++;
        }
        set.add(nums[high]);
        windowSum += nums[high];
        score = Math.max(score, windowSum);
     }
     return score;   
    }
}