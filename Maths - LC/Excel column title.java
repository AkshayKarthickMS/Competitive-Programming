class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder op = new StringBuilder();

        int quo = columnNumber;
        int rem = 0;

        while (quo > 26){
            rem = columnNumber % 26;
            quo = columnNumber / 26;
            op.append((char)(rem+64));
        }
        op.append((char)(quo+64));
        return op.reverse().toString();
    }
}