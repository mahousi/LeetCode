class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int rowlength = A.length;
        int columnlength = A[0].length;
        for(int i = 0;i < rowlength;i++){
            for(int j = 0;j < (columnlength+1)/2;j++){
                int tmp = A[i][j] ^ 1;
                A[i][j] = A[i][columnlength-j-1] ^ 1;
                A[i][columnlength-j-1] = tmp;
            }
        }
        return A;
    }
}
