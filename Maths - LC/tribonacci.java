class Solution {
    public int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        if (n == 0){
            return a;
        }else if (n == 1){
            return b;
        }else if (n == 2){
            return c;
        }else{
            for (int i = 3; i < n; i++){
                int temp = a + b + c;
                a = b;
                b = c;
                c = temp;
            }
        }
        return a + b + c;
    }
}