class Solution {
    public int[][] transpose(int[][] A) {
        int m = A[0].length;
        int n = A.length;
        int res[][] = new int [m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                res[i][j] = A[j][i];
            }
        }
        return res;
    }
}
