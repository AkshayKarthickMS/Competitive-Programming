class Solution {
    public int addDigits(int num) {
        while (num > 9){
            num = sum(num);
        }
        return num;
    }

    public int sum(int x){
        int add = 0;
        while (x > 0){
            add += x%10;
            x/=10;
        }
        return add;
    }
}