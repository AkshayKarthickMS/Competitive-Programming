class Solution {
    public String countAndSay(int n) {
        // code here
        
        String s = "11";
          if (n == 1){
              return "1";
          }
           else if (n == 2){
               return "11";
           }
           else {
               
               for (int i = 3; i <= n; i++){
                   char c = s.charAt(0);
                   int cnt = 1;
                   String temp = "";
                   for (int j = 1; j < s.length(); j++){
                       if (c == s.charAt(j)){
                           cnt++;
                       }
                       else{
                           temp = temp + Integer.toString(cnt) + c;
                           c = s.charAt(j);
                           cnt = 1;
                       }
                   }
                   temp = temp + Integer.toString(cnt) + c;
                   s = temp;
               }
               
               
               
           }
        return s;
    }
}
