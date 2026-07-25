class Solution {
    public List<String> midPattern(String s) {
        // code here
        List<String> list = new ArrayList<>();
        
        int i = 0;
        int j = s.length()-1;
        
        if (j==0){
            list.add(s);
            return list;
        }
        
        int k = j / 2;
        int stop = k;
        String temp = "";
        
        
        
        while (i != stop){
            if (k<=j){
                temp = temp + s.charAt(k);
                list.add(temp);
                k++;
            }
            else{
                temp = temp + s.charAt(i);
                list.add(temp);
                i++;
            }
        }
        return list;
    }
}