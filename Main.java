import java.util.*;
class main
{
    public static void main(String[] args)
    {
     
      Scanner sc = new Scanner(System.in);

      String roman = sc.nextLine().toUpperCase();
      

      Solution a = new Solution();
      int result = a.romanToInt(roman);

      System.out.println(result);
     
    }
}
