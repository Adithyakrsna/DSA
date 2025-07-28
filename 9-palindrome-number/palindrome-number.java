class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int res=0;
        while(x>0){
            int ans = x%10;
            res = res*10+ans;
            x=x/10;
        }
        if (res==temp){
            return true;
        }
        return false;
        
    }
}