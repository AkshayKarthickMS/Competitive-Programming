class Solution {
public:
    int characterReplacement(string s, int k) {
        int left = 0;
        int maxLength = 0;
        int maxFrequency = 0;

        vector<int> map(26, 0);

        for(int right = 0; right < s.size(); right++){
            int index = s[right] - 'A';
            map[index]++;

            maxFrequency = max(maxFrequency, map[index]);

            int currentLength = right - left + 1;

            if(currentLength - maxFrequency > k){
                map[s[left] - 'A']--;
                left++;
            }

            currentLength = right - left + 1;

            maxLength = max(maxLength, currentLength);
        }
        return maxLength;
    }
};