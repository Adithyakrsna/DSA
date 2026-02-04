class Solution {
    public int findContentChildren(int[] Student, int[] Cookie) {
        Arrays.sort(Student);
        Arrays.sort(Cookie);
        int n = Student.length;
        int m = Cookie.length;
        int i=0,j=0;
        int count =0;

        while(i<n && j<m){
            if(Student[i]<=Cookie[j]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}