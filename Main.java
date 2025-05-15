import java.util.*;
public class main
{
    public static void main (String[] args)
    {
       Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numslist  = new ArrayList<>();

        while(true)
        {
            int num = scanner.nextInt();
            if(num == -1) 
            break;

            numslist.add(num);
        }

        int[] nums  = new int[numslist.size()];
        for(int i = 0; i < numslist.size(); i++ )
        {
           nums[i] = numslist.get(i); 
        } 



        int target = scanner.nextInt();


        Solution a = new Solution();
        
        int[] result = a.twoSum(nums,target);
        
        System.out.println(result[0]+ ','+ result[1]);
        
    }
}