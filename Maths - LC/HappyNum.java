class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = process(slow);
            fast = process(process(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public int process(int x){
        int op = 0;
        while (x > 0){
            int rem = x % 10;
            op += rem * rem;
            x /= 10;
        }
        return op;
    }
}