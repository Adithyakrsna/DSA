class Solution {
    public int maxOperations(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int j = n-1;
        int i = 0;
        int count=0;
        while(i<j){
            
            if(arr[i]+arr[j]==k){
                count++;
                j--;
                i++;
                continue;
            }
            if(arr[i]+arr[j]>k){
                
                j--;
                
                continue;
            }
            if(arr[i]+arr[j]<k){
                
                i++;
                
                continue;
            }
            
            

        
        }
        return count;
    }
}