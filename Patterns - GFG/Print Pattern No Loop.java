class Solution {
    public ArrayList<Integer> pattern(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        result(list,n);
        return list;
    }
    
    private void result(ArrayList<Integer> list, int num){
        if (num<=0){
            list.add(num);
            return;
        }
        
        list.add(num);
        
        result(list,num-5);
        
        list.add(num);
    }
}