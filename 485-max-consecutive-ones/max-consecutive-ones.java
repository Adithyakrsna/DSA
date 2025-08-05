class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int count=0;
        int max=0;
        for(int i = 0 ; i < n; i++){
            if(arr[i]==1){
                count++;
                if(max<count){
                    max=count;
                }
            }else if(arr[i]!=1){
                count=0;
            }
            

        }
        return max;
    }
}