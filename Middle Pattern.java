class Solution {
    public List<String> midPattern(String s) {
        // code here
        List<String> list = new ArrayList<>();
        
        int len = s.length();
        int mid = len / 2;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < len; i++){
            int idx = (mid + i) % len;
            sb.append(s.charAt(idx));
            list.add(sb.toString());
        }
        

        return list;
    }
}