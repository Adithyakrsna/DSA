class Solution {
    public int removeElement(int[] arr, int val) {
        int n = arr.length;
        int a = 0 ; 
        for(int i = 0 ; i < n ; i++){
            
            if(arr[i]!=val){
                arr[a]=arr[i];
                a++;
            }
        }
        return a;
    }
}