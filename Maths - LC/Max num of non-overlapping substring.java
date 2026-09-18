import java.util.*;

class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            if (first[c] == -1) first[c] = i;
            last[c] = i;
        }

        List<String> res = new ArrayList<>();
        int rightmostEnd = -1;

        for (int i = n - 1; i >= 0; i--) {
            int c = s.charAt(i) - 'a';
            // Only evaluate when i is the first index of character c
            if (i == first[c]) {
                int curRight = last[c];
                int j = i;
                boolean isValid = true;

                while (j <= curRight) {
                    int innerChar = s.charAt(j) - 'a';
                    if (first[innerChar] < i) {
                        isValid = false; // Invalid: spans before starting point 'i'
                        break;
                    }
                    curRight = Math.max(curRight, last[innerChar]);
                    j++;
                }

                if (isValid) {
                    if (rightmostEnd == -1 || curRight < rightmostEnd) {
                        res.add(s.substring(i, curRight + 1));
                        rightmostEnd = i; // Enforce non-overlapping condition
                    }
                }
            }
        }

        return res;
    }
}