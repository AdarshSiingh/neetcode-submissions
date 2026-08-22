class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = 1 , r = 1 , n = nums.length;
        int[] a = new int[n];

        for(int i = 0 ; i < n ; i++ )
        {
            a[i]=l;
            l*=nums[i];
        }

        for(int i = n-1 ; i>=0 ;i--)
        {
            a[i]*=r;
            r*=nums[i];
        }

        return a;
        
    }
}  
