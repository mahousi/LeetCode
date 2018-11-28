
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int B[] = new int[A.length];
        int a = 0,b = A.length-1;int x;
        for(int i = 0;i < A.length;i++){
            if(A[i] %2 != 0){
                B[b] = A[i];
                b--;
            }
            else {
                B[a] = A[i];
                a++;
            }

        }
        return B;
    }        
}
