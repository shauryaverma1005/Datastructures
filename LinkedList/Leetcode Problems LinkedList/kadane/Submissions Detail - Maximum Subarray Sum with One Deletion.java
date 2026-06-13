class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        if(n==1){
            return arr[0];
        }
        int max=Integer.MIN_VALUE;
        int nodelete=arr[0];
        int onedelete=Integer.MIN_VALUE;
        for(int i =1;i<n;i++){
            int v3=0;
            int prevnodelete = nodelete;
            nodelete = Math.max(arr[i], nodelete + arr[i]);
            if(onedelete == Integer.MIN_VALUE){
                v3=prevnodelete;
            } else {
                v3 = onedelete + arr[i];
            }
            onedelete = Math.max(v3, prevnodelete);
            max = Math.max(max, Math.max(onedelete, nodelete));
        }
        return max;
    }
}