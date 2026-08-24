class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
        List<List<Integer>> ll = new ArrayList<>();
        int n = a.length , j = 0 , k = 0 , sum =0;

        for(int i = 0 ; i<n;i++)
        {
            if(i>0 && a[i]==a[i-1]) continue;
            k = n-1;
            j=i+1;

            while(j<k)
            {
                sum=a[i]+a[j]+a[k];
                if(sum<0)
                j++;
                else if(sum>0)
                k--;
                else
                {
                    ll.add(Arrays.asList(a[i],a[j],a[k]));
                    j++;
                    k--;
                    while(j<k && a[k] == a[k+1]) k--;
                    while(j<k && a[j] == a[j-1]) j++;
                }

            }
        } 
        return ll;
        
    }
}
