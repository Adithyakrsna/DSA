class Solution {
    public int[] numberGame(int[] arr) {
        
        Arrays.sort(arr);
        
       
        for(int i = 1 ;i<arr.length;i+=2){
            arr[i] = arr[i-1] ^ arr[i];
            arr[i-1] = arr[i-1] ^ arr[i];
            arr[i] = arr[i-1] ^ arr[i];
            // int temp = arr[i];
            // arr[i] = arr[i-1];
            // arr[i-1]  = temp;
        }
        return arr;
    }
}