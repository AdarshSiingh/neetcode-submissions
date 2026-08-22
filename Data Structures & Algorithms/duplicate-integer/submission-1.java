class Solution {
    public boolean hasDuplicate(int[] n) {
        Set<Integer> s = new HashSet<>();

        for(int i: n)
        s.add(i);

        if(s.size() == n.length) return false;

        return true;

        
    }
}