class Solution {
    public int reverse(int x) {     
        int ans=0;
        while(x!=0){
            int rem = x%10;
            if (ans<Integer.MIN_VALUE/10||ans> Integer.MAX_VALUE/10){
            return 0;
            }
            ans = 10*ans+rem; 

            x=x/10;
        }
        return ans;        
    }
}