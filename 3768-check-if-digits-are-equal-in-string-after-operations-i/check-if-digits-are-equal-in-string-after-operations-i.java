class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i)-'0';
        }

        while (n > 2) {
            int[] next = new int[n-1];
            for (int i =0;i<n-1;i++){
                next[i] = (arr[i]+arr[i+1])%10;
            }
            arr=next;
            n = arr.length;
        }
        return arr[0]==arr[1];
    }
    
    





           
    
}