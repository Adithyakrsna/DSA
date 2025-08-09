class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        if(n==0){
            return false;
        }
        int count = 0; 
        int temp =0;
        for(int i = 1 ;i < n;i++){
            if (count>1){
                return false;

            }
            if(arr[i]<arr[i-1]){
                count++;
                temp = arr[i-1];
            }
            
        }
        if(count==0){
            return true;
        }
        if(arr[0]>=arr[n-1]&&count<2){
            return true;
        }
         return false;
    }
}