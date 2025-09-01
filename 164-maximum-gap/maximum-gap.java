class Solution {
    public int maximumGap(int[] arr) {
        int n = arr.length;
        if(n==1){
            return 0;
        }
        int max =0;
        Arrays.sort(arr);
        for(int i = 1 ;i < n;i++){
            int ans = arr[i]-arr[i-1];
            if(max<ans){
                max = ans;
            }
        }
        return max;
    }
}