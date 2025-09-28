class Solution {
    public void reverseString(char[] c) {
        int n = c.length;
        for(int i = 0 ;i < n/2;i++){
            char temp = c[i];
            c[i] = c[n-i-1];
            c[n-i-1] = temp;

        }

    }
}