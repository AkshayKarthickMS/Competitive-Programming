class Solution {
    public int reverseDigits(int n) {
        // Code here
        int op = 0;
        
        while (n > 0){
            op = (op * 10) + (n % 10);
            n /= 10;
        }
        return op;
    }
}