class Solution {
    public int[] plusOne(int[] arr) {
int n = arr.length;

        
        for(int i = n-1 ; i >=0 ; i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
                arr[i]=0;
            
        }
        
        int[] result = new int[n + 1];
        result[0] = 1; 
        // for(int i=1;i<n;i++){
        //     arr[i]=0;
        // }


        return result;      }
    
    
}