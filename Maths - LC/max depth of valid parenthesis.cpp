class Solution {
public:
    int maxDepth(string s) {
        int maxx = 0;
        int curr_depth = 0;
        
        for (char c : s) {
            if (c == '(') {
                curr_depth++;
                maxx = max(curr_depth, maxx);
            } else if (c == ')') {
                curr_depth--;
            }
        }
        return maxx;
    }
};