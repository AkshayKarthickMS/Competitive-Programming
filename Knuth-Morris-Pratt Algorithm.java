class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        int outer = txt.length();
        int inner = pat.length();
        
        if (inner > outer) return -1;
        
        for (int i = 0; i <= outer-inner; i++){
            boolean match = true;
            for (int j = 0; j < inner; j++){
                if (txt.charAt(i+j) != pat.charAt(j)){
                    match = false;
                    break;
                }
            }
            if (match) return i;
        }
    return -1;
    }
}