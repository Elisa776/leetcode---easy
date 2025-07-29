class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for(String sentence : sentences)
        { 
            String[] words = sentence.split(" ");
            if(words.length > ans){
                ans = words.length;
            }
        }
        return ans;
    }
}
