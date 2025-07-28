class Solution {
    public void rotate(int[] arr, int k) {
        int m = arr.length;
        k =k%m;
        
        reverseArray(arr, 0,m-k-1);
        reverseArray(arr,m-k,m-1);
        reverseArray(arr,0,m-1);
        
        
    }

    public void reverseArray(int []arr , int start , int end ){
        while (start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}