class Solution {
    public List<Integer> getRow(int r) {
        //  int [] arr = new int[r];
        ArrayList <Integer> arr = new ArrayList<>();
        int ans =  1;
        arr.add(0,1) ;
        for(int i = 1 ; i <=r ;i++){
            
            arr.add((int)((long)arr.get(i - 1) * (r - i + 1) / i));            
        }
        return arr;
        
    }
}