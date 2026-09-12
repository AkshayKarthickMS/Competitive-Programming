class Solution {
    public int[] findSum(int n) {
        // Code here
        int[] res = new int[2];
        int odd = (n + 1) / 2;
        int even = n / 2;
        res[0] = odd * odd;
        res[1] = even * (even + 1);
        
        return res;
    }
}