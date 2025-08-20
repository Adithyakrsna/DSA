class Solution {
    public int maxSubArray(int[] arr) {

        int n = arr.length;
        
        
        int ans =0 ;
        int temp=Integer.MIN_VALUE;
        for(int i = 0; i < n ; i++){
            
                ans+=arr[i];
                if(ans>temp){
                    temp = ans;
                }
                
            
            if(ans<0){
               
                ans=0;
            }
        }
        return temp;

    }
}