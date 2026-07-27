class Solution {
    public ArrayList<Integer> printPat(int n) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = n; i > 0; i--){
            for (int j = n; j > 0; j--){
                for (int k = 0; k < i; k++){
                    list.add(j);

                }
            }
            list.add(-1);
        }
        return list;
    }
}