class Solution {
public:
    int hammingWeight(int n) {
        int res = 0;
        while(n > 0){
            int rem = n % 2;
            if (rem == 1) res++;
            n /= 2;
        }
        return res;
    }
};