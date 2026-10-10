class Solution {
public:
    long long minSumSquareDiff(vector<int>& nums1, vector<int>& nums2, int k1, int k2) {
        map<int, int, greater<int>> hashmap;
        for(int i = 0; i < nums1.size(); i++){
            hashmap[abs(nums1[i] - nums2[i])]++;
        }

        long long k = k1 + k2;
        long long res = 0;
        for(const auto& pair : hashmap){
            long long key = pair.first;
            long long value = pair.second;

            if(key == 0 || k == 0) break;

            if(value <= k){
                hashmap[key - 1] += value;
                hashmap[key] = 0;
                k = k - value;
            }else{
                hashmap[key - 1] += k;
                hashmap[key] = value - k;
                k = 0;
            }
        }
        for(const auto& pair : hashmap){
            long long key = pair.first;
            long long value = pair.second;
            cout<< key;
            cout<< value;
            if(key){
                res = res + ((key * key) * value);
            }else{
                break;
            }
        }
        return res;
    }
};