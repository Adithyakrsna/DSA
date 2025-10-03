class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int arr [] = new int [n];
        Arrays.sort(nums);
        int i = 0 ;
        int j= 1;
        int count = 0;
        while(j<n ){
            arr[count]= nums[j];
            count++;
            arr[count]= nums[i];
            count++;
            i+=2;
            j+=2;
            
        }
        return arr;
    }
}