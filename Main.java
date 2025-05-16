import java.util.*;
public class main
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("x = ");

       int x = sc.nextInt();

       Solution a = new Solution();
 
        boolean result = a.isPalindrome(x);
        System.out.print(result);
       
    }
}
