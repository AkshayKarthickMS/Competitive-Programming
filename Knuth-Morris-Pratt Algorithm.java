class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        int outer = txt.length();
        int inner = pat.length();
        
        if (inner > outer) return -1;

        int[] lps = new int[inner];
        lps[0] = 0;
        int prevLPS = 0;
        int i = 1;
        
        while (i < inner){
            if (pat.charAt(i) == pat.charAt(prevLPS)){
                prevLPS++;
                lps[i] = prevLPS;
                i++;
            }
            else if (prevLPS == 0){
                lps[i] = 0;
                i++;
            }
            else {
                prevLPS = lps[prevLPS - 1];
            }
        }
        
        i = 0;
        int j = 0;
        
        while (i < outer){
            if (txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;
            }
            else {
                if (j == 0){
                    i++;
                }
                else {
                    j = lps[j-1];
                }
            }
            if (j == inner){
                return i - j;
            }
        }

    return -1;
    }
}