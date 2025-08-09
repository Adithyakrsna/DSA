class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length ;
        int low = 0 ;
        int mid =0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]= temp;
                low++;
                mid++;
                continue;
            }
            if(arr[mid]==1){
                mid++;  
                continue;            
            }
            if(arr[mid]==2){
                int tempp = arr[high];
                arr[high]=arr[mid];
                arr[mid] = tempp;
                high--;              
            }
        }
    }
}