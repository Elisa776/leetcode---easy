class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x = 0;

        for (String op : operations) {

            if (op.equals("++X") || op.equals("X++")) {
                x++;
            }
            else  {
                x--;
            }
        }
        return x;
    }
}       
