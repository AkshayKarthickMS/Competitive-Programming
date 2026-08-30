class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder op = new StringBuilder();
        
        while (columnNumber > 0){
            columnNumber--;
            int rem = columnNumber % 26;
            op.append((char)(rem + 'A'));
            columnNumber /= 26;
        }

        return op.reverse().toString();
    }
}