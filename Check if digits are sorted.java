class Solution {
    public boolean isMonotonic(String s) {
        // code here
        int len = s.length();
        boolean asc = true;
        boolean desc = true;
        
        if (len == 0) return false;
        if (len == 1) return true;
        
        for (int i = 1; i < len; i++){
            char prev = s.charAt(i-1);
            char curr = s.charAt(i);
            
            if (prev < curr){
                desc = false;
            }
            
            if (prev > curr){
                asc = false;
            }
            
            if (!asc && !desc){
                return false;
            }
        }
        return asc || desc;
    }
};