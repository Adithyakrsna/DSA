class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;
        int max = 0 ;
        int r = 0 ; 
        int l = 0 ;
        int zeros = 0 ;

        while(r < n){
            if(arr[r]==0){
                zeros++;
            }
            if(zeros>k){
                if(arr[l] == 0){
                    zeros--;
                }
                l++;
            }
            if(zeros <= k){
                int len = r-l+1;
                max = Math.max(len,max);
            }
            r++;
        }
        return max;
    }
}