class Solution {
    class P
    {
        int x , y;
        P(int a, int b)
        {x=a;y=b;}
    }
    public int[] topKFrequent(int[] n, int k) {

        Map<Integer,Integer> m = new HashMap<>();
        int[] a = new int[k];
        
        for(int i : n)
        m.put(i,m.getOrDefault(i,0)+1);

        PriorityQueue<P> q = new PriorityQueue<>((s,t)-> t.y - s.y);

        for(int x : m.keySet())
        {
            q.add(new P(x,m.get(x)));
        }
        for(int i = 0;i<k;i++)
        {
            int x = q.remove().x;
            a[i] = x;
        }

        return a;

        
    }
}
