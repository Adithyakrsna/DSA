class Solution {
    public int splitArray(int[] arr, int k) {
        int n = arr.length;
        int low =0;
        int high = 0 ;

        for(int i =0 ; i < n ;i++){
            if(low<arr[i]){
                low=arr[i];
            }
            high += arr[i];
        }
        while(low<=high){
            int mid = ( low+high)/2;

            if(canwe(arr, mid)>k){
                low= mid+1;

            }else{
                high=mid-1;


            }

        }
        return low;
        
    }
    static int canwe(int [] arr , int tar ){
        int n = arr.length;
        int sum =arr[0];
        int count =1;
         for(int i = 1 ; i < n ; i++){
            if(arr[i]+sum <= tar){
                sum+=arr[i];
            }else{
                sum=arr[i];
                count++;

            }
         }
         return count;
    }
}