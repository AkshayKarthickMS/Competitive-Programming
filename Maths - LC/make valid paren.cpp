class Solution {
public:
    int minAddToMakeValid(string s) {
        int cnt = 0;
        stack<char> res;
        for(char c : s){
            if(c == '('){
                res.push(c);
            }else if(res.empty()){
                cnt++;
            }else{
                res.pop();
            }
        }
        return cnt + res.size();
    }
};