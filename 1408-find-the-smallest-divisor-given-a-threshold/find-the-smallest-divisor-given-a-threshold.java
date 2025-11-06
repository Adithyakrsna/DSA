class Solution {
    public int smallestDivisor(int[] arr, int limit) {
        int low = 1;
        int n = arr.length;
        if (n > limit) return -1;
        int high = 1000000;
        

        // for(int i = 0 ;i <n;i++){
        //     high = Math.max(high,arr[i]);
        // }

        while(low<= high){
            int mid = low+(high-low)/2;

            if(isTrue(arr,mid,limit)){
                high = mid-1;
            }else{
                low = mid+1;
            }


        }
        return low;

    }

    public boolean isTrue(int [] arr, int mid,int limit){
        int ans = 0;

        for(int i = 0 ;i <arr.length;i++){
            // ans+= Math.ceil((double)arr[i]/(double)mid);
            ans = ans + (arr[i] + mid - 1) / mid;
        }

        if(ans<=limit){
            return true;
        }
        return false;
        
    }

    
}