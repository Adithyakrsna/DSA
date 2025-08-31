class Solution {
     public List<Integer> getrow(int row){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        int ans = 1;
        for(int i = 1 ; i < row;i++){
            // arr.add((int)((ans*(row-i))/i)) ;
            ans = ans * (row -i);
            ans = ans / i;
            arr.add((int) ans);
            //arr.add((int)((long)arr.get(i - 1) * (row - i + 1) / i));  
        }
        return arr;
    }
    public List<List<Integer>> generate(int n) {
        List<List <Integer>> arr = new ArrayList<>();
        for(int i = 1; i<=n ;i++){
            arr.add(getrow(i));

            
        }return arr;

    }
}