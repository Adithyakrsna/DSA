class Solution {
    public int[] searchRange(int[] arr, int target) {
         int ans [] = {-1,-1};

        int start = search(arr, target , true);
        int end = search(arr, target , false);

        ans[0]=start;
        ans[1]=end;
        return ans;
    
    }

    public int search (int[] arr , int target, boolean ifTrue){
        int start = 0;
        int end  = arr.length-1;
        int ans = -1;

        while(start<=end){
            int mid = end +(start - end)/2;

            if(arr[mid]< target){
                start = mid+1;
            }else if(arr[mid]>target){
                end = mid-1;


            }else{
                ans = mid;
                if(ifTrue==true){
                    end = mid-1;
                }
                if(ifTrue==false){
                    start = mid+1;
                }
            }

            
        }
        return ans;
    }
}