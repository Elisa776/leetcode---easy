class Solution {
    public int scoreOfString(String s) {

    
        int n = s.length();
        
 
        int ascii = 0;

        for (int i = 0; i < n - 1; i++) {
            
            ascii += Math.abs(s.charAt(i) - s.charAt(i + 1));

        }
        
        return ascii;

    }
}
