class Solution {
    public String intToRoman(int num) {
      String[] s={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String t="";
       int i=0;
       while(num>0){
           if(num>=values[i]){
               t+=s[i];
               num-=values[i];
           }
            else
           i++;
       }
        return t;
    }
}   
    
