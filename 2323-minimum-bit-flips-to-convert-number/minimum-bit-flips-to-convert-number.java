class Solution {
    public int minBitFlips(int start, int goal) {
        int n = start^goal;
        int count = 0;
        for(int i = 0 ; i <31;i++){
            if((n&1)==1){
                count++;
            }
            n= n>>1;
        }
        return count;
    }
}