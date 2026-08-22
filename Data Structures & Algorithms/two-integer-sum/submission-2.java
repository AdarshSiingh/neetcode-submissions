class Solution {
    public int[] twoSum(int[] n, int t) {

        int s = n.length , l = 0 , r = s-1 , sum = 0;
        int a[][] = new int[s][2];

        for(int i = 0;i<s;i++)
        {
            a[i][0] = n[i];
            a[i][1] = i;
        }
        Arrays.sort(a,(x,y)->x[0]-y[0]);

       while(l<r)
       {
        sum = a[l][0] + a[r][0];
        if(sum == t) 
        return new int[]{
        Math.min(a[l][1], a[r][1]),
        Math.max(a[l][1], a[r][1])
};
        else if(sum > t)
        r--;
        else
        l++;

       }
       return new int[]{};


        
    }
}
