class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int n = s.length();
        int max=0;
        HashSet<Character> set = new HashSet<>();
        for(int high=0; high<n; high++){
           char ch = s.charAt(high);
           while(set.contains(ch)){
                set.remove(s.charAt(low));
                low++;
           }
           set.add(ch);
           max = Math.max(max, high-low+1);
        }    
        return max;

    }
}