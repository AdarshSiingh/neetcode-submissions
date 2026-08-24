class Solution {
    public int[] twoSum(int[] n, int t) {

        int s = n.length, l = 0, r = s - 1;

        while(l < r) {
            int sum = n[l] + n[r];

            if(sum == t)
                return new int[]{l + 1, r + 1};
            else if(sum > t)
                r--;
            else
                l++;
        }

        return new int[]{};
    }
}