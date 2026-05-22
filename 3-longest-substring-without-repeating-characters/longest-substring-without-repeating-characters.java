class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int hashl = 256;

        int [] hash = new int[hashl];

        Arrays.fill(hash,-1);

        int l = 0 ,r = 0, max = 0;

        while(r<n){
            if(hash[s.charAt(r)]>= l){
                l = Math.max(hash[s.charAt(r)]+1,l);

            }
            int len = r -l +1;

            max = Math.max(len,max);

            hash[s.charAt(r)] = r;
            r++;

            
        }
        
        return max;

    }
}