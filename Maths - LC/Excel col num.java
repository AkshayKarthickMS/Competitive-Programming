class Solution {
    public int titleToNumber(String columnTitle) {
        int op = 0;
        for (int i = 0; i < columnTitle.length(); i++){
            op = op * 26 + (int)(columnTitle.charAt(i)-64);
        }
        return op;
    }
}