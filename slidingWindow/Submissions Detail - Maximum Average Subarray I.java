class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int low = 0;
        int high;
        int sum = 0;

        // Build first window
        for(high = 0; high < k && high < nums.length; high++) {
            sum += nums[high];
        }

        // First window average
        double maxAvg = (double) sum / k;

        // Slide window
        while(high < nums.length) {

            sum -= nums[low];
            low++;

            sum += nums[high];
            high++;

            maxAvg = Math.max(maxAvg, (double) sum / k);
        }

        return maxAvg;
    }
}