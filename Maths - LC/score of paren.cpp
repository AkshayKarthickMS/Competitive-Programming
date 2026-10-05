class Solution {
public:
    int scoreOfParentheses(string s) {
        stack<int> res;
        res.push(0);

        for(char c : s){
            if(c == '('){
                res.push(0);
            }else{
                int inner = res.top();
                res.pop();
                int outer = res.top();
                res.pop();
                res.push(outer + max(2 * inner, 1));
            }
        }
        return res.top();
    }
};