class Solution {
    public ArrayList<Integer> pattern(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        if (n <= 0){
            return list;
        } else{
            dec_func(list,n,n);
        }
        return list;
    }
    public void dec_func(ArrayList<Integer> list, int num, int n){
        
        num = num-5;
        list.add(num);
        
        if (num > 0){
            dec_func(list,num,n);
        }else{
            inc_func(list,num,n);
        }
        return;
    }
    public void inc_func(ArrayList<Integer> list, int num, int n){
        num = num + 5;
        list.add(num);
        
        if (num != n){
            inc_func(list,num,n);
        }else{
            return;
        }
    }
}