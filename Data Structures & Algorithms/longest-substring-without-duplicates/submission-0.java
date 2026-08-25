class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int l = 0 , r = 0 , max = 0;

        Set<Character> set = new HashSet<>();

        while(r<n)
        {
            while(set.contains(ch[r]))
            set.remove(ch[l++]);

            set.add(ch[r]);
            max = Math.max(max , r-l+1);

            r++;
            
        }

        return max;
        
    }
}
