class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    //     int n = mat.length;
    //     int m = mat[0].length;

        

    //     int index = -1;  

    //     for (int i = 0; i < n; i++) {

            
    //         if(lowerBound(mat[i], target)){
    //             return true;
    //         }
    //     }
    //     return false;



       
    // }
    // private boolean lowerBound(int[] arr, int target) {
    //     int low = 0, high = arr.length - 1;
        

    //     while (low <= high) {
    //         int mid = (low + high) / 2;
            
           
    //         if(arr[mid] == target){
    //             return true;
    //         }else if(arr[mid]> target){
    //             high = mid-1;
    //         }else{
    //             low = mid+1;
    //         }
    //     }
        
    //     return false;

    int n = matrix.length;
        int m = matrix[0].length;

        int row = 0, col = m - 1;

        while (row < n && col >= 0) {
            
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) row++;
            else col--;
        }
        return false;

        
    }
}