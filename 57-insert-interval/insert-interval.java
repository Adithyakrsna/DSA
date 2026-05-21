class Solution {
    public int[][] insert(int[][] intervals, int[] newinterval) {
        //your code goes here
        List<int[]> res = new ArrayList<>();
        int i = 0 ;
        int n = intervals.length;
        // for the starting part which dosent operlap
        
        while(i<n && intervals[i][1] < newinterval[0]){
            res.add(intervals[i]);
            i =i+1;
        }
        //for the operlapping  part
        while(i < n && intervals[i][0]<= newinterval[1]){
            newinterval[0] = Math.min(intervals[i][0], newinterval[0]);
            newinterval[1] = Math.max(intervals[i][1], newinterval[1]);
            i=i+1;
        }
        res.add(newinterval);
        // for the remaining
        while(i<n){
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}