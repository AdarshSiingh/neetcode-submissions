class Solution {
    public int maxProfit(int[] p) {
        
        int n = p.length;
        int pr = Integer.MIN_VALUE , min = Integer.MAX_VALUE;

        for(int i = 0 ;i<n;i++)
        {
            pr = Math.max(pr,p[i]-min);
            min = Math.min(min,p[i]);
        }

        return pr>=0 ? pr : 0;

   
        
    }
}
