class Solution {
    public int strStr(String haystack, String needle) {

        int n = needle.length();
        int n1 = haystack.length();

        for(int i = 0; i<= n1 - n; i++){
  
          int j = 0;
          while(j < n && haystack.charAt(i + j) == needle.charAt(j)){
           
           j++;

          }
          
          if(j == n){

            return i; 
          }

        }
        
       return -1;
    }
}
