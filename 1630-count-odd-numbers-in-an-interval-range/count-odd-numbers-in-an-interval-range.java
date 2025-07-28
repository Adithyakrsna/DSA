class Solution {
    public int countOdds(int low, int high) {
        // int ans = high/2;
        // if((ans)%2==0){
        //     return ans;
        // }else{
        //     if(low%2==0){
        //         return ans-1;
        //     }else{
        //         return ans;
        //     }
        // }
        // return 0;
         return (high + 1) / 2 - (low / 2);
    }
}