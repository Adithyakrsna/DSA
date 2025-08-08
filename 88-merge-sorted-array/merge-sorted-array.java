class Solution {
    public void merge(int[] arr, int n, int[] arrr, int m) {
        int a = 0 ; 
        int b = 0 ;
        
        for(int i = 0 ; i<m ;i ++){
            arr[n+i] = arrr[i];

        }
        
        Arrays.sort(arr);
    }
}