class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;

        for(int i = 0 ; i <n;i++){
            if(count1==0 && arr[i]!=ele2){
                ele1= arr[i];
                count1 = 1;

            }else if(count2==0 && arr[i]!=ele1){
                ele2= arr[i];
                count2=1;
            }else if(arr[i]==ele1){
                count1++;
            }else if(arr[i]==ele2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for( int i = 0 ; i < n;i++){
            if(arr[i]==ele1){
                count1++;
            }
            if(arr[i]==ele2){
                count2++;
            }
        }   
        
        int min = (n/3)+1;

        List<Integer> arrr = new ArrayList<>();

        if(count1>=min){
            arrr.add(ele1);
        }
        if(count2>=min&& ele1!=ele2){
            arrr.add(ele2);
        }

        return arrr;
        
    }
}