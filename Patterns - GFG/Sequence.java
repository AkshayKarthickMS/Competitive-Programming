class Solution {
    // static final 
    public int NthTerm(int n) {
        // code here
        int MOD = 1_000_000_007;
        long temp = 2;
        for (int i = 2 ; i <= n; i++){
            temp = (temp*i + 1) % MOD;
        }
        return (int)temp;
    }
}