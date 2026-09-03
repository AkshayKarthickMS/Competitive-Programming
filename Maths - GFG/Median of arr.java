class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        
        if (arr.length % 2 == 0){
            return ((double)arr[arr.length/2] + (double)arr[(arr.length/2)-1]) / (double)2;
        }
        else{
            return arr[arr.length/2];
        }
    }
}
