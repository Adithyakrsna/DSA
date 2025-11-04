class Solution {
    public int mySqrt(int n) {
        // n= (int)Math.sqrt(n);
        // return n; 
        int low = 1;
        int high = n;
        

        while(low<= high ){
            int mid = low +(high-low)/2;

            if(((long)mid*(long)mid) <= (long)n){
                low = mid+1;
              
            }else{
                high = mid-1;

            }
            
        }
        return high;


    }
}