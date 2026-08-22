class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        Map<String, List<String>> m = new HashMap<>();

        for(String x:s)
        {
            String k = sort(x);
            m.putIfAbsent(k,new ArrayList<>());
            m.get(k).add(x);
        }

        return new ArrayList<>(m.values());



        
    }
    String sort(String s)
    {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
