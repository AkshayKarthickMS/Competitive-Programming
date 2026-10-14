class Solution {
public:
    string maxSumOfSquares(int num, int sum) {
        string n = "";
        long long cnt = 0;

        while(sum > 0 & cnt != num){
            if (sum > 9){
                n += "9";
                sum -= 9;
                cnt++;
            }else{
                n += to_string(sum);
                sum = 0;
            }
        }
        if (sum != 0) return "";
        if (n.length() < num) {
            n += string(num - n.length(), '0');
        }
        return n;
    }
};