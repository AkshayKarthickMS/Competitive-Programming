class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> num = new ArrayList<>();
        for(int i = 1; i < n; i++){
            fact *= i;
            num.add(i);
        }
        num.add(n);

        String perm = "";
        k -= 1;

        while (true){
            perm += num.get(k / fact);
            num.remove(k / fact);
            if (num.size() == 0) break;
            k %= fact;
            fact /= num.size();
        }
        return perm;
    }
}