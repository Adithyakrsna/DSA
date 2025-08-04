class Solution {
    public boolean isPowerOfTwo(int n) {
        // int count=0;
        // while(n>0){
        //     if((n&1)==1){
        //     count++;
        //     }
        //     n=n>>1;
        // }
        // if(count==1){
        //     return true;
        // }
        // return false;
         if(n<=0)
            return false;
        int c=0;
        while(n!=0){
            if(c==1)
                return false;
            c++;
            n=n & n-1;
        }
            return true;
        
    }
}