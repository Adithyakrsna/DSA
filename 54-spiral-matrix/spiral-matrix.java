class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int top = 0 ;
        int right = m-1;
        int bottom = n-1;
        int left = 0;

        List <Integer> map = new ArrayList<>();
        while(top<=bottom && left<= right){
            for(int i = left ;i <= right;i++ ){
                map.add(arr[top][i]);
            }
            top++;
            for(int i = top ; i <= bottom ; i++){
                map.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i = right ; i>=left;--i){
                    map.add(arr[bottom][i]);
                }
                bottom--;
            }
            
            if(left<= right){
                for(int i = bottom ; i>=top;--i){
                    map.add(arr[i][left]);
                }
                left++;
            }
            
        }
        return map;


    }
}