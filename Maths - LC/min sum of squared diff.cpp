class Solution {
public:
    long long minSumSquareDiff(vector<int>& nums1, vector<int>& nums2, int k1, int k2) {
        long long k = (long long)k1 + k2;
        long long totalDiff = 0;
        vector<long long> bucket(100001, 0); // Max possible difference is 10^5
        
        // Populate the buckets with frequencies of each absolute difference
        for (int i = 0; i < nums1.size(); i++) {
            int diff = abs(nums1[i] - nums2[i]);
            bucket[diff]++;
            totalDiff += diff;
        }
        
        // Corner case: if k is enough to reduce all differences to 0
        if (k >= totalDiff) return 0;
        
        // Greedily reduce the highest differences in bulk
        for (int i = 100000; i > 0 && k > 0; i--) {
            if (bucket[i] > 0) {
                // Determine how many elements of this difference we can actually reduce
                long long reduce = min(k, bucket[i]);
                
                bucket[i] -= reduce;
                bucket[i - 1] += reduce;
                k -= reduce;
            }
        }
        
        // Calculate the final sum of squared differences
        long long res = 0;
        for (long long i = 1; i <= 100000; i++) {
            if (bucket[i] > 0) {
                res += (i * i) * bucket[i];
            }
        }
        
        return res;
    }
};