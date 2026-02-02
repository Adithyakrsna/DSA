class Solution {
    public int[] singleNumber(int[] arr) {
         int xor  = 0 ;
        
        for(int i = 0 ; i < arr.length ; i++){
            xor ^= arr[i];
        }

        int right = (int)xor &(xor-1) ^ (int)xor;

        int xor1=0,xor2=0;

        for(int i = 0 ; i <arr.length;i++){
            if((arr[i] & right ) != 0){
                xor1 ^= arr[i];
            }else{
                xor2 ^= arr[i];
            }
        }
        return new int[]{xor2,xor1};
    }
}