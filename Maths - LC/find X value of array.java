#include <vector>

using namespace std;

class Solution {
public:
    vector<long long> resultArray(vector<int>& nums, int k) {
        vector<long long> result(k, 0); // Stores the final count for each remainder x
        vector<long long> current_counts(k, 0); // Tracks subarray remainder counts ending at current index

        for (int num : nums) {
            vector<long long> next_counts(k, 0);
            int rem = num % k;

            // 1. A new subarray consisting of just the current element
            next_counts[rem]++;

            // 2. Extend previous subarrays ending at index i - 1
            for (int prev_rem = 0; prev_rem < k; prev_rem++) {
                if (current_counts[prev_rem] > 0) {
                    int new_rem = (prev_rem * rem) % k;
                    next_counts[new_rem] += current_counts[prev_rem];
                }
            }

            // 3. Add current index counts to the total answer
            for (int r = 0; r < k; r++) {
                result[r] += next_counts[r];
            }

            // Move to the next index
            current_counts = move(next_counts);
        }

        return result;
    }
};