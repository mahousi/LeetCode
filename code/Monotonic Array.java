class Solution {
    public boolean isMonotonic(int[] A) {
        boolean inc = false;
        boolean dec = false;
        for(int i = 0;i < A.length-1;i++){
            if(A[i] > A[i+1]){
                inc = true;
            }
            if(A[i] < A[i+1]){
                dec = true;
            }
        }
        return inc && dec ?false:true;
    }
}
