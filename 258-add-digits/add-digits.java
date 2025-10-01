class Solution {
    public int addDigits(int num) {
        
       
       int anss= 0;
        
            
            while(num>0){
                int res = num %10;
                anss+=res;
                num=num/10;

            }
           
         if(anss>9){
            anss = addDigits(anss);
         }  
           
        return anss;
    }
    

}