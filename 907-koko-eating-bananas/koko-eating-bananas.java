class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int low = 1;
        int n = arr.length;
        
        int high = 0;
        

        for(int i = 0 ;i <n;i++){
            high = Math.max(high,arr[i]);
        }

        while(low<=high){
          int mid = low+ (high-low)/2;

          if(isTrue(arr,mid,h)){
            high = mid-1;
          }
          else{
            low = mid+1;
          }
        }
        return low;   
    }
    public boolean isTrue(int [] arr, int mid,int h){
      int ans = 0;
      for (int i = 0 ;i <arr.length;i++){
        ans = ans + (arr[i] + mid - 1) / mid;
        if (ans > h) return false;
        // int count =0;
        // if(arr[i]%mid!=0){
        //   count++;
        // }
        // ans += (ans/mid)+count;
      }
      if(ans<=h){
        return true;
      }
      return false;
        
    }
}