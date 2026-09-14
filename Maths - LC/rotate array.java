class Solution {
    public void rotate(int[] nums, int k) {
    k%=nums.length;
    if(k<0)
    {
        k+=nums.length;
    }
    reverse(nums,0,nums.length-1);
    reverse(nums,0,k-1);
    reverse(nums,k,nums.length-1);
    }

    public void reverse(int[] subarray, int start, int end) {
        while (start < end) {
            int temp = subarray[start];
            subarray[start] = subarray[end];
            subarray[end] = temp;
            start++;
            end--;
        }
    }
}