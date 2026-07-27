class Solution {
    public ArrayList<Integer> printPat(int n) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int temp = n;
        for (int i = n; i > 0; i--){
            temp = n;
            for (int j = n; j > 0; j--){
                for (int k = i; k > 0; k--){
                    list.add(temp);

                }
                temp--;
            }
            list.add(-1);
        }
        return list;
    }
}