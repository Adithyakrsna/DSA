class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int pov = 0 ;
        int neg = 1 ;
        int [] arrr = new int[n];
        for(int i = 0 ; i < n ;i++){
            if(arr[i]>0){
                arrr[pov]=arr[i];
                pov+=2;
            }else{
                arrr[neg] = arr[i];
                neg+=2;
            }
        }
        return arrr;
    }
}