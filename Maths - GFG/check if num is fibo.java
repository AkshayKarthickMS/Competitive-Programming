class Solution {
    public boolean isFibonacci(int n) {
        // Use long to prevent potential overflow if n was larger
        long nLong = (long) n;
        long a = (5 * nLong * nLong) + 4;
        long b = (5 * nLong * nLong) - 4;

        if (perfect_square(a) || perfect_square(b)){
            return true;
        }
        return false;
    }

    // Change parameter and internal variables to long
    public boolean perfect_square(long x){
        long low = 1;
        long high = x;
        long mid = 0;
        long square = 0;

        while (low <= high){
            mid = low + (high - low) / 2;
            square = mid * mid; // Now safely calculates up to 6.25 * 10^16 without overflow

            if (square == x){
                return true;
            } else if (square < x){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}