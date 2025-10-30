class Solution {
    public boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
       
            while(low<= high){
                int mid = low+(high-low)/2;
                if(target==arr[mid]){
                    return true;

                }
                if(arr[low] == arr[mid]&& arr[mid] == arr[high]){
                    low = low+1;
                    high = high-1;
                    continue;
                }
                // line 1;
                if(arr[mid]>=arr[low]){
                    if(arr[low] <= target && target <= arr[mid]){
                        high = mid-1;

                    }else{
                        low = mid+1;

                    }
                }
                //line 2
                else{
                    if(target <= arr[high] && target > arr[mid]){
                        low = mid+1;

                    }else{
                        high = mid-1;

                    }
                }
            }
            return false;
    }
}