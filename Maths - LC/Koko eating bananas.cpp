#include <vector>

using namespace std;

class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int low = 1, high = findMaxValue(piles);

        while(low <= high){
            int mid = low + (high - low) / 2;
            long long hours = calculateHours(piles, mid);

            if (hours <= h){
                high = mid - 1;

            }else{
                low = mid + 1;
            }
        }
        return low;
    }


    int findMaxValue(vector<int> &v){
        int maxi = INT_MIN;
        for (int i = 0; i < v.size(); i++){
            maxi = max(maxi, v[i]);
        }
        return maxi;
    }

    long long calculateHours(vector<int> &piles, int hour){
        long long calcHour = 0;
        for (int i = 0; i < piles.size(); i++){
// Integer ceiling formula: ceil(a / b) == (a + b - 1) / b
            calcHour += (piles[i] + (long long)hour - 1) / hour;        }
        return calcHour;
    }
};