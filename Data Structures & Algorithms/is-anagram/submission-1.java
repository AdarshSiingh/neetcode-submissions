class Solution {
    public boolean isAnagram(String ss, String tt) {

        if(ss.length() != tt.length()) return false;

        char[] s = ss.toCharArray() , t = tt.toCharArray();

        Map<Character,Integer> m = new HashMap<>();

        for(char c:s)
        m.put(c,m.getOrDefault(c,0)+1);

        for(char c:t)
        {
            if(!m.containsKey(c)) return false;
            m.put(c,m.get(c)-1);
            if(m.get(c) < 0) return false;
        }

        return true;




    }
}
