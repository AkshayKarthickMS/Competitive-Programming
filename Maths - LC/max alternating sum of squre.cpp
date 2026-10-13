class Solution {
public:
    long long maxAlternatingSum(vector<int>& nums) {
        for (int& num : nums) {
            num = num * num;
        }
        sort(nums.begin(), nums.end(), greater<int>());

        int len = nums.size();
        int mid = len / 2 + (len % 2);

        long long odd = accumulate(nums.begin(), nums.begin() + mid, 0LL);
        long long even = accumulate(nums.begin() + mid, nums.end(), 0LL);

        return odd - even;
    }
};