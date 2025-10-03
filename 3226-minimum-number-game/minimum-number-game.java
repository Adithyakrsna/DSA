class Solution {
    public int[] numberGame(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        
       
        for(int i = 1 ;i<n;i+=2){
            // arr[i] = arr[i-1] ^ arr[i];
            // arr[i-1] = arr[i-1] ^ arr[i];
            // arr[i] = arr[i-1] ^ arr[i];
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1]  = temp;
        }
        return arr;
    }
}