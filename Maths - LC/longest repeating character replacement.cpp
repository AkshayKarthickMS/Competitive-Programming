#include <vector>
#include <string>

using namespace std;


class Solution {
public:
    int characterReplacement(string s, int k) {
        int left = 0;
        int maxFrequency = 0;

        vector<int> map(26, 0);

        for(int right = 0; right < s.size(); right++){
            // map[s[right] - 'A']++;
            
            maxFrequency = max(maxFrequency, ++map[s[right] - 'A']);

            if((right - left + 1) - maxFrequency > k){
                map[s[left] - 'A']--;
                left++;
            }
        }
        return s.size() - left;
    }
};