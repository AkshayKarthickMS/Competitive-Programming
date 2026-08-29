class Solution {
    public String countAndSay(int n) {
        // code here
        
        String s = "1";

               
               for (int i = 2; i <= n; i++){
                   char c = s.charAt(0);
                   int cnt = 1;
                   StringBuilder temp = new StringBuilder();
                   for (int j = 1; j < s.length(); j++){
                       if (c == s.charAt(j)){
                           cnt++;
                       }
                       else{
                           temp.append(cnt).append(c);
                           c = s.charAt(j);
                           cnt = 1;
                       }
                   }
                   temp.append(cnt).append(c);
                   s = temp.toString();
               }
               
        return s;
    }
}
