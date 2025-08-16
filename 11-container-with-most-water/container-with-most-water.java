class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int a = 0 ;
        int b = n-1;
        int max=0;
        while(a<=b){
            //int min = Math.min(arr[a],arr[b]);
            int min;
            if(arr[a]<=arr[b]){
                min = a;
            }else{
                min= b;
            }
            int ans = (b-a)*arr[min];
            if(ans>max){
                max= ans;

            }

            if(arr[a]>=arr[b]){
                b--;
            }else{
                a++;
            }

        }
        return max;
    }
}