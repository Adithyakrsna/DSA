class Solution {
    public int splitArray(int[] arr, int k) {

        
        int low = 0;
            int high = 0;
             int n = arr.length;

            for(int i = 0 ; i< n ;i++){
                
                high += arr[i];
                if(arr[i] > low){
                    low = arr[i];
                }
            }
        while(low<=high){
                int mid = (low+high)/2;
                if(task(arr, mid)>k){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            return low;


        }
    

    static int task (int [] arr ,int mid ){
        int sum = 0;
        int target  = 1;
        int n = arr.length;
        for(int i =  0 ; i < n ;i++){
            if((sum+arr[i])<=mid){
                sum+=arr[i];
            }else{
                sum=arr[i];
                target++;
            }
        }
        return target;
    }
}