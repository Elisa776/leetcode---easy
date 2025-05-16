class Solution {
    public boolean isPalindrome(int x) 
    {
      int digit = 0;
      int temp = x;
      int s = 0;
       
      if(x == 0) return true;
      if(x > 0)
      {
        while(temp > 0)
        {
         
          digit = temp%10;
          s = s*10+digit;
          temp = temp/10;
        }

        if(s == x)
        {
           return true;
        }
        else
        {
            return false;
        }
      }
      return false;
    }

}