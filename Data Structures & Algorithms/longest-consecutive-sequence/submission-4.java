class Solution {
    public int longestConsecutive(int[] a) {

        int n = a.length;
        if(n == 0) return 0;
        Arrays.sort(a);
        int c = 1 , m = 1;

        for(int i = 1 ; i<n;i++)
        {
            if(a[i] == a[i-1]) continue;

            if(a[i] == a[i-1]+1)
            {
                c++;
                m = Math.max(c,m);
            }
            else
            c=1;
        }
        return m;

        
    }
}
