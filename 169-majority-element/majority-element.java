class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;

        int element = arr[0];
        int count = 0 ;
        for(int i = 0 ; i < n ;i++){
            if(count == 0){
                element=arr[i];
            }
            if(arr[i]==element){
                count++;
            }else{
                count--;
            
            }
            
            
        }
        return element;
    }
}