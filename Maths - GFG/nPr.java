class Solution {
    public long nPr(int n, int r) {
        // code here
        return factorial(n) / factorial(n-r);
    }
    
    public long factorial(int x){
        if (x == 1 || x == 0){
            return 1;
        }
        return x * factorial(x-1);
    }
}