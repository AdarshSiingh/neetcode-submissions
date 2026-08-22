class Solution {
    public boolean isPalindrome(String s) {
        
        char c[] = s.toCharArray();

        int n = c.length , l = 0 , r = n-1;

        while(l<r)
        {
            while(l<r && !Character.isLetterOrDigit(c[l])) 
            l++;

            while(l<r && !Character.isLetterOrDigit(c[r])) 
            r--;

    if(Character.toLowerCase(c[l++]) != Character.toLowerCase(c[r--]))
    return false;
        }

        return true;
        
    }
}
