class Solution {
    public int trap(int[] h) {

        int n = h.length , s= 0;
        int[] l = new int[n] , r = new int[n];

        l[0] = h[0]; r[n-1] = h[n-1];

        for(int i = 1 ; i<n;i++)
        l[i] = Math.max(h[i],l[i-1]);

        for(int i = n-2;i>=0;i--)
        r[i] = Math.max(h[i],r[i+1]);

        for(int i = 0 ;i<n;i++)
        s+= Math.min(l[i],r[i]) - h[i];

        return s;


        
    }
}
