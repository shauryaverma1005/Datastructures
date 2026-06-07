class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int cost[] = new int[n];
        for(int i=0; i<n;i++){
            cost[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int left=0;
        int maxLen=0;
        int windowSum =0;
        for(int right=0; right<n; right++){
            windowSum += cost[right];
            while(windowSum>maxCost){
                windowSum -= cost[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left +1);
        }
        return maxLen;
    }
}