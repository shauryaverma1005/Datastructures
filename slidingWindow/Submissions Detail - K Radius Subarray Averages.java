class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int result[] = new int[n];

        Arrays.fill(result, -1);

        if (k >= n || (2 * k + 1) > n) {
            return result;
        }

        if (k == 0) {
            return nums;
        }

        int i = 0;
        long windowSum = 0;

        // Initial window sum
        while (i <= k) {
            if ((i - k) < 0) {
                windowSum = windowSum + nums[i] + nums[k + i + 1];
                i++;
            } else if ((i - k) == 0) {
                windowSum += nums[k];
                break;
            }
        }

        int start = 0;
        int end = 2 * k;
        int mid = (start + end) / 2;

        while (end < n - 1) {
            result[mid] = (int) (windowSum / (2 * k + 1));

            windowSum -= nums[start];
            start++;

            end++;
            mid++;

            windowSum += nums[end];
        }

        // Last valid window
        result[mid] = (int) (windowSum / (2 * k + 1));

        return result;
    }
}