class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int low = 0;
        int freq[] = new int[26];
        int maxLen = 0;
        int maxFreq = 0;
        for(int high =0; high<n; high++){
            int ch = s.charAt(high) - 'A';
            freq[ch]++;

            maxFreq = Math.max(maxFreq, freq[ch]);

            while((high-low+1) - maxFreq > k){
                freq[s.charAt(low)- 'A']--;
                low++;
            }
            maxLen = Math.max(maxLen, (high-low)+1);
        }
        return maxLen;
    }
}