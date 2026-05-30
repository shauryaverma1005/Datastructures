class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int windowSum =0;
        int result=0;
        if(k> arr.length){
            return 0;
        }
        if(k==0){
            return 0;
        }
        for(int i=0; i<k;i++){
            windowSum += arr[i];
        }
        int start=0, end=k-1;
        while(end<n-1){
            if((windowSum/k)>=threshold){
                result++;
            }
            windowSum -= arr[start];
            start++;
            end++;
            windowSum += arr[end];
        }
        if((windowSum/k)>=threshold){
                result++;
            }
            return result;
    }
}